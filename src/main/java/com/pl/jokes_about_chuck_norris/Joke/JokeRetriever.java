package com.pl.jokes_about_chuck_norris.Joke;

import com.pl.jokes_about_chuck_norris.History.Joke;
import com.mashape.unirest.http.exceptions.UnirestException;

public interface JokeRetriever {

     Joke getJoke() throws UnirestException;
}
