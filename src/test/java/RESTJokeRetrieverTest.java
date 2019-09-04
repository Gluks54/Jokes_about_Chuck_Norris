
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Before;
import org.junit.Test;
import Joke.*;

import static junit.framework.TestCase.assertTrue;

public class RESTJokeRetrieverTest {
    RESTJokeRetriever restJokeRetriever;

    @Before
    public void setUp() {
        restJokeRetriever = new RESTJokeRetriever();
    }

    @Test
    public void testRESTJokeRetriver() throws UnirestException {
        assertTrue(restJokeRetriever.getJoke() != null);
    }
}
