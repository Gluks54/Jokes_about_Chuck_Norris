package com.pl.jokes_about_chuck_norris.AddOptWithDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetLastNumberOFJokes {
    public ArrayList<String> getLustJokes(String number) {

        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(number);

        if (matcher.find()) {
            throw new IllegalArgumentException();
        }
        String query = String.format("SELECT textOfJoke " +
                "FROM jokText ORDER BY id desc LIMIT %s;", number);
        ArrayList<String> tempArr = new ArrayList<>();

        try (
                Connection connection
                        = DriverManager.getConnection(
                        DataForDB.getUrl(), DataForDB.getRoot(), DataForDB.getPass())) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                tempArr.add(resultSet.getString("textOfJoke"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return tempArr;
    }
}
