package com.pl.jokes_about_chuck_norris.AddOptWithDb;

import java.sql.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetJokesNumberOfTimeAgo {

    public ArrayList<String> getJokes(String start, String end) throws IllegalArgumentException {

        Pattern pattern = Pattern.compile("^(20|21|22|23|[01]\\d|\\d)(([0-5]\\d){1,2})$");
        Matcher matcherStart = pattern.matcher(start);
        Matcher matcherEnd = pattern.matcher(end);

        if (!matcherStart.find() || !matcherEnd.find()) {
            throw new IllegalArgumentException();
        }
        ArrayList<String> tempArr = new ArrayList<>();

        String query = "SELECT textOfJoke  FROM jokText WHERE actionTime BETWEEN" +
                "\t" + start + "\t" + "AND" + "\t" + end;

        try (Connection connection
                     = DriverManager.getConnection(
                DataForDB.getUrl(), DataForDB.getRoot(), DataForDB.getPass())) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                tempArr.add(resultSet.getString("textOfJoke"));
            }
        } catch (
                SQLException ex) {
            System.out.println(ex);
        }
        return tempArr;
    }
}

