package AddOptWithDb;

import Joke.RESTJokeRetriever;
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

//        System.out.println("GetNewJokes:\n");
//        ArrayList<String> ArrNewJokes = newJoke.getJoke("10");
//        for(String i: ArrNewJokes){
//            System.out.println(i);
//        }
//
//        System.out.println("\n All jokes in DB:\n");
//        ArrayList<String> tempAllJokes = allJokes.GetAllJokes();
//        for(String i: tempAllJokes){
//            System.out.println(i);
//        }
        System.out.println("\n GetNumberOfJokes:\n");
        ArrayList<String> tempNumberOfJokes = getLastNumberOFJokes.getLustJokes("5");
        for(String i: tempNumberOfJokes){
            System.out.println(i);
        }

        //System.out.println(getJokesNumberOfTimeAgo.getJokes("220030","240000"));




    }
}
