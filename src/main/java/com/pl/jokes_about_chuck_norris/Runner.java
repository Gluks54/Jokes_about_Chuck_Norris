package com.pl.jokes_about_chuck_norris;

import com.pl.jokes_about_chuck_norris.History.FileHistory;
import com.pl.jokes_about_chuck_norris.Joke.RESTJokeRetriever;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws UnirestException, IOException {
        RESTJokeRetriever restJokeRetriever = new RESTJokeRetriever();
        FileHistory history = new FileHistory();

        JokeStreamFormatter jokeStreamFormatter = new JokeStreamFormatter(history, restJokeRetriever);

        List<String> listWithJokes = jokeStreamFormatter.getNewJokes(10);
        for (String i : listWithJokes) {
            System.out.println(i);
        }
    }
}
