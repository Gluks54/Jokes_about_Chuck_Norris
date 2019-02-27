package AddOptWithDb;
import History.History;

import java.sql.*;


public class SaveJoke{

    public boolean saveJokeWithId(String id, String joke){
        String queryID =  "INSERT  jokid(idHash) VALUE (?);";
        String queryJoke = "INSERT  joktext (textOfJoke,actionTime) VALUE  (?,CURRENT_TIME());";
        try (
                Connection connection =
                        DriverManager.getConnection(DataForDB.getUrl(), DataForDB.getRoot(), DataForDB.getPass());
             PreparedStatement preparedStatementID = connection.prepareStatement(queryID);
             PreparedStatement preparedStatementJoke = connection.prepareStatement(queryJoke)){

            preparedStatementID.setString(1,id);
            preparedStatementJoke.setString(1,joke);

            if(preparedStatementID.execute() == false && preparedStatementJoke.execute() == false  ){return true;}
        }catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }
}
