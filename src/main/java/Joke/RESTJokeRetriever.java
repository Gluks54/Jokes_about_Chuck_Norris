package Joke;

import History.Joke;
import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RESTJokeRetriever implements JokeRetriever {

    @Override
    public Joke getJoke() throws UnirestException {
        String url = "https://api.chucknorris.io/jokes/random";
        Gson gson = new Gson();
        String responce = Unirest.get(url).asString().getBody();
        Joke joke = gson.fromJson(responce,Joke.class);
        return joke;
    }
}