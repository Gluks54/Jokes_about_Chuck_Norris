package AddOptWithDb;

import java.sql.*;

public class CheckHystoryId {
    public boolean CheckHyst(String id) throws SQLException {
        String query = "SELECT id FROM jokes WHERE id = ?";

        try (Connection connection
                     = DriverManager.getConnection(
                DataForDB.getUrl(), DataForDB.getRoot(), DataForDB.getPass());
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next() == true) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
}

