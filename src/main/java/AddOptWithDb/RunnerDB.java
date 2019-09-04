package AddOptWithDb;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.sql.SQLException;
import java.util.ArrayList;

public class RunnerDB {
    public static void main(String[] args) throws SQLException, UnirestException {

        CheckHystoryId checkHystoryId = new CheckHystoryId();
        SaveJoke saveJokeWithId = new SaveJoke();
        AllJokes allJokes = new AllJokes();
        DeletAllJokes deletAllJokes = new DeletAllJokes();
        GetLastNumberOFJokes getLastNumberOFJokes = new GetLastNumberOFJokes();
        GetJokesNumberOfTimeAgo getJokesNumberOfTimeAgo = new GetJokesNumberOfTimeAgo();
        NewJoke newJoke = new NewJoke();

        System.out.println("GetNewJokes:\n");
        ArrayList<String> arrNewJokes = newJoke.getJoke("10");
        for (String i : arrNewJokes) {
            System.out.println(i);
        }

        System.out.println("\n All jokes from DB:\n");
        ArrayList<String> tempAllJokes = allJokes.GetAllJokes();
        for (String i : tempAllJokes) {
            System.out.println(i);
        }
        System.out.println("\n GetLustNumberOfJokes:\n");
        ArrayList<String> tempNumberOfJokes = getLastNumberOFJokes.getLustJokes("3");
        for (String i : tempNumberOfJokes) {
            System.out.println(i);
        }

//        HHmmss -> time format
        System.out.println("\n Get jokes between two points of time:\n");
        ArrayList<String> tempTwoPointArr = getJokesNumberOfTimeAgo.getJokes("125030", "130000");
        for (String i : tempTwoPointArr) {
            System.out.println(i);
        }

        System.out.println("\n Delete All jokes :\n");
        if (deletAllJokes.deletAll()) {
            System.out.println("Operation delete all jokes complete successfully");
        } else {
            System.out.println("Operation incomplete");
        }
    }
}
