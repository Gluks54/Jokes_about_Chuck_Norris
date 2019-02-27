package AddOptWithDb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeletAllJokes {
    public boolean deletAll(){
        String delId = "DELETE FROM jokid";
        String delText = "DELETE FROM jokText";
        try (Connection connection
                        = DriverManager.getConnection(
                        DataForDB.getUrl(),DataForDB.getRoot(),DataForDB.getPass())){

            CallableStatement callableStatementID = connection.prepareCall(delId);
            CallableStatement callableStatementText = connection.prepareCall(delText);

            boolean hadRezultID = callableStatementID.execute();
            boolean hadRezultText = callableStatementText.execute();
             if(hadRezultID == false && hadRezultText == false){return true;}
        }catch(
                SQLException ex){
            System.out.println(ex);
        }
        return false;
    }
}
