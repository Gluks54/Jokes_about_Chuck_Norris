import AddOptWithDb.GetJokesNumberOfTimeAgo;
import AddOptWithDb.GetLastNumberOFJokes;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

@RunWith(JUnitParamsRunner.class)
public class GetLustNumberOfJokeTest {
   GetLastNumberOFJokes getLastNumberOFJokes;
    @Before
    public void SetUp(){
        getLastNumberOFJokes = new GetLastNumberOFJokes();
    }
    @Test
    @Parameters({
            "-1",
            "-",
            "d"})
    public void tetsValidParams(int number){
        try{getLastNumberOFJokes.getLustJokes(number);
            fail();
        } catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }
    @Test
    public void testNumberOfJoke(){
        int expected = 10;
        ArrayList<String> answer = getLastNumberOFJokes.getLustJokes(10);
        assertEquals(expected,answer.size());
    }
}
