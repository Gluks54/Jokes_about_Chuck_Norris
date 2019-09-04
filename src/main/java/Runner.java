import History.FileHistory;
import Joke.RESTJokeRetriever;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws UnirestException, IOException {
        JokeStreamFormatter jokeStreamFormatter = new JokeStreamFormatter(history, restJokeRetriever);
        RESTJokeRetriever restJokeRetriever = new RESTJokeRetriever();
        FileHistory history = new FileHistory();

        List<String> listWithJokes = jokeStreamFormatter.getNewJokes(10);
        for (String i : listWithJokes) {
            System.out.println(i);
        }
    }
}
