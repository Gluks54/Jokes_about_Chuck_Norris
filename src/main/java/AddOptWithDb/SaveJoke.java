package AddOptWithDb;
import History.History;

import java.sql.*;


public class SaveJoke{

    public boolean saveJokeWithId(String id, String joke){
        String query = "INSERT INTO jokes(id,joke,addTime)\n" +
                "VALUE (?,?,CURRENT_TIME());";
        try (
                Connection connection =
                        DriverManager.getConnection(DataForDB.getUrl(), DataForDB.getRoot(), DataForDB.getPass());
             PreparedStatement preparedStatement = connection.prepareStatement(query)){

            preparedStatement.setString(1,id);
            preparedStatement.setString(2,joke);

            if(preparedStatement.execute() == false){return true;}
        }catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }


}
