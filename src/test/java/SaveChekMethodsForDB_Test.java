import AddOptWithDb.CheckHystoryId;
import AddOptWithDb.DeletAllJokes;
import AddOptWithDb.SaveJoke;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static junit.framework.TestCase.assertEquals;

public class SaveChekMethodsForDB_Test {
    SaveJoke saveJoke;
    CheckHystoryId checkHystoryId;
    DeletAllJokes deletAllJokes;

    @Before
    public void SetUp() {
        saveJoke = new SaveJoke();
        checkHystoryId = new CheckHystoryId();
        deletAllJokes = new DeletAllJokes();
        deletAllJokes.deletAll();
        boolean saveIdSetUp = saveJoke.saveJokeWithId("1", "just joke");
    }

    @Test
    public void testSaveMethod() {
        boolean saveId = saveJoke.saveJokeWithId("2", "just joke");
        boolean expected = true;
        assertEquals(saveId, expected);
    }

    @Test
    public void testCheckMethod() throws SQLException {
        boolean expected = true;
        boolean chekHystory = checkHystoryId.CheckHyst("1");
        assertEquals(chekHystory, expected);
    }
}
