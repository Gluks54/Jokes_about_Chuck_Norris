package AddOptWithDb;

import java.util.TimeZone;

public class DataForDB {
    public static String getUrl() {
        String dbname = "jdbc:mysql://localhost:3306/jokes";
        return dbname + "?serverTimezone=" + TimeZone.getDefault().getID();
    }

    public static String getRoot() {
        return "root";
    }

    public static String getPass() {
        return "1234";
    }
}
