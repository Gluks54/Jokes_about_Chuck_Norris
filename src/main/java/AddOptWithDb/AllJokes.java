package AddOptWithDb;

import java.sql.*;
import java.util.ArrayList;

public class AllJokes {

    public ArrayList<String>  GetAllJokes (){

        ArrayList<String> tempArr = new ArrayList<>();
        String query = "SELECT * FROM jokText";

        try (Connection connection
                     = DriverManager.getConnection(
                DataForDB.getUrl(),DataForDB.getRoot(),DataForDB.getPass())){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                tempArr.add(resultSet.getString("textOfJoke"));
            }
        } catch(SQLException ex){
            System.out.println(ex);}
        return tempArr;
    }
}

