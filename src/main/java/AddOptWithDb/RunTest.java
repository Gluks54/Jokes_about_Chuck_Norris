package AddOptWithDb;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.sql.SQLException;

public class RunTest {
    public static void main(String[] args) throws SQLException, UnirestException {
        SaveJoke saveJoke = new SaveJoke();
        AllJokes allJokes = new AllJokes();
//        DeletAllJokes deletAllJokes = new DeletAllJokes();
//        deletAllJokes.deletAll();
//        System.out.println(allJokes.GetAllJokes());
        for (int i = 0; i<= 100;i++){
            saveJoke.saveJokeWithId("reghryjtkyiykyi", "adgsfhdfhdfhdf");
        }
    }
}
