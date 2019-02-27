package AddOptWithDb;

import History.Joke;
import Joke.RESTJokeRetriever;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewJoke {
    public ArrayList<String> getJoke(String numberOfJokes) throws UnirestException, SQLException {

        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(numberOfJokes);

        if(matcher.find()){
            throw new IllegalArgumentException();
        }

        Integer temInt = new Integer(numberOfJokes);
        int intNumb = temInt;

        RESTJokeRetriever restJokeRetriever = new RESTJokeRetriever();
        CheckHystoryId checkHystoryId = new CheckHystoryId();
        SaveJoke saveJoke = new SaveJoke();
        ArrayList<String> temArr = new ArrayList<>();
        Joke joke;

        while (temArr.size() <= (intNumb - 1)){
           joke = restJokeRetriever.getJoke();
           boolean answerFromDB = checkHystoryId.CheckHyst(joke.getId());
           if(!answerFromDB){
               saveJoke.saveJokeWithId(joke.getId(),joke.getValue());
               temArr.add(joke.getValue());
           }
        }
        return temArr;
    }

}
