import History.FileHistory;
import History.Joke;
import Joke.JokeRetriever;
import Joke.RESTJokeRetriever;
import com.mashape.unirest.http.exceptions.UnirestException;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(JUnitParamsRunner.class)
public class JokeStreamFormatterTest {

    FileHistory fileHistory;
    JokeRetriever jokeRetriever;
    @Before
    public void setUp(){
        fileHistory = new FileHistory();
    }

    @Test
    public void testJokeStreamFormatter() throws UnirestException, IOException {
        //Cleaning up history
        PrintWriter writer = new PrintWriter("History.txt");
        writer.print("");
        writer.close();
        // Fake object
       Joke joke1 = new Joke();
       joke1.setId("sckhsdjvcs");
       joke1.setValue("First joke");

       Joke joke2 = new Joke();
       joke2.setId("dbchsdvcvjsdc");
       joke2.setValue("Second joke");

       Joke joke3 = new Joke();
       joke3.setId("ncvkhsbfhjvd");
       joke3.setValue("Third joke");

       Joke joke4 = new Joke();
        joke4.setId("bfhsdvbjcsd");
        joke4.setValue("Fourth joke");
        //Mocking
        jokeRetriever = Mockito.mock(RESTJokeRetriever.class);
        //Behavior
       when(jokeRetriever.getJoke()).thenReturn(joke1).thenReturn(joke2).thenReturn(joke3).thenReturn(joke4);

       JokeStreamFormatter jokeStreamFormatter = new JokeStreamFormatter(fileHistory,jokeRetriever);
        List<String> actual = jokeStreamFormatter.getNewJokes(4);

        List<String> expectedArr = new ArrayList<>();
        expectedArr.add("First joke");
        expectedArr.add("Second joke");
        expectedArr.add("Third joke");
        expectedArr.add("Fourth joke");

        assertTrue(expectedArr.containsAll(actual));
    }
}

