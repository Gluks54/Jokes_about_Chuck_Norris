import com.pl.jokes_about_chuck_norris.AddOptWithDb.DeletAllJokes;
import com.pl.jokes_about_chuck_norris.AddOptWithDb.NewJoke;
import com.pl.jokes_about_chuck_norris.AddOptWithDb.SaveJoke;
import com.mashape.unirest.http.exceptions.UnirestException;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.SQLException;

import static junit.framework.TestCase.fail;

@RunWith(JUnitParamsRunner.class)
public class NewJokeTest {
    NewJoke newJoke;
    SaveJoke saveJoke;
    DeletAllJokes deletAllJokes;

    @Before
    public void setUp() {
        newJoke = new NewJoke();
        saveJoke = new SaveJoke();
        deletAllJokes = new DeletAllJokes();
        deletAllJokes.deletAll();
    }

    @Test
    @Parameters({
            "-1",
            "-",
            "d"})
    public void tetsValidParams(String number) throws UnirestException, SQLException {
        try {
            newJoke.getJoke(number);
            fail();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}
