package AddOptWithDb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeletAllJokes {
    public boolean deletAll(){
        String query = "call DELETE_All()";
        try (Connection connection
                        = DriverManager.getConnection(
                        DataForDB.getUrl(),DataForDB.getRoot(),DataForDB.getPass())){

            CallableStatement callableStatement = connection.prepareCall(query);
            boolean hadRezult = callableStatement.execute();
             if(hadRezult == false){return true;}
        }catch(
                SQLException ex){
            System.out.println(ex);
        }
        return false;
    }
}
