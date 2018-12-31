import History.*;
import Joke.JokeRetriever;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JokeStreamFormatter {

    private final History history;
    private final JokeRetriever jokeRetriever;

    public JokeStreamFormatter(History history, JokeRetriever jokeRetriever) {
        this.history = history;
        this.jokeRetriever = jokeRetriever;
    }

    List<String> getNewJokes(int numberOfJoke) throws UnirestException, IOException {
        List<String> listOfJokes = new ArrayList<>();

       while ((listOfJokes.size()) <= (numberOfJoke - 1)){
           Joke joke = jokeRetriever.getJoke();
           Set<String> historySet = history.getHistory();
           Set<String> saveHistorySet = new HashSet<>();

           if (!historySet.contains(joke.getId())) {
               listOfJokes.add(joke.getValue());
               saveHistorySet.add(joke.getId());
               history.saveHistory(saveHistorySet);
           }
       }
        return listOfJokes;
    }
}