package AddOptWithDb;

import java.sql.*;

public class CheckHystoryId {
    public boolean CheckHyst(String id) throws SQLException {
        String query = "SELECT idHash FROM jokid WHERE idHash = ?";

        try (Connection connection
                     = DriverManager.getConnection(
                DataForDB.getUrl(), DataForDB.getRoot(), DataForDB.getPass());
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet.findColumn("idHash"));
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
}

