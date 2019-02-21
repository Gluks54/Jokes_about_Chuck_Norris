package AddOptWithDb;

import java.sql.*;
import java.util.ArrayList;

public class AllJokes {
    public ArrayList<String>  GetAllJokes (){
        ArrayList<String> tempArr = new ArrayList<>();
        String query = "SELECT * FROM jokes";
        try (Connection connection
                     = DriverManager.getConnection(
                DataForDB.getUrl(),DataForDB.getRoot(),DataForDB.getPass())){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println(resultSet);
            while (resultSet.next()) {
                tempArr.add(resultSet.getString(1));
                System.out.println(
                        resultSet.getString(1) +"\t"
                                + resultSet.getString(2) +"\t"
                                + resultSet.getString(3));
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        };
        System.out.println(tempArr);
        return tempArr;
    }
}

