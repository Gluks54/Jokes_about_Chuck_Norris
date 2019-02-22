package AddOptWithDb;

import java.sql.SQLException;

public class RunnerDB {
    public static void main(String[] args) throws SQLException {
        AllJokes allJokes = new AllJokes();
       CheckHystoryId checkHystoryId = new CheckHystoryId();
        DeletAllJokes deletAllJokes = new DeletAllJokes();
  SaveJoke saveJokeWithId = new SaveJoke();
  GetJokesNumberOfTimeAgo getJokesNumberOfTimeAgo = new GetJokesNumberOfTimeAgo();
        System.out.println(getJokesNumberOfTimeAgo.getJokes("220030","240000"));




    }
}
