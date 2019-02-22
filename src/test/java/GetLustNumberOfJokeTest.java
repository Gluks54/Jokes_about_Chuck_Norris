import AddOptWithDb.DeletAllJokes;
import AddOptWithDb.GetLastNumberOFJokes;
import AddOptWithDb.SaveJoke;
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
    DeletAllJokes deletAllJokes;
    SaveJoke saveJoke;
   @Before
    public void SetUp(){
        getLastNumberOFJokes = new GetLastNumberOFJokes();
        deletAllJokes = new DeletAllJokes();

        saveJoke = new SaveJoke();
    }
    @Test
    @Parameters({
            "-1",
            "-",
            "d"})
    public void tetsValidParams(String number){
        try{getLastNumberOFJokes.getLustJokes(number);
            fail();
        } catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }
    @Test
    public void testNumberOfJoke(){
        deletAllJokes.deletAll();
        saveJoke.saveJokeWithId("1","First joke");
        saveJoke.saveJokeWithId("2","second joke");
        saveJoke.saveJokeWithId("3","third joke");

        int expected = 3;
        ArrayList<String> answer = getLastNumberOFJokes.getLustJokes("3");
        System.out.println(answer);
        assertEquals(expected,answer.size());
    }
}
