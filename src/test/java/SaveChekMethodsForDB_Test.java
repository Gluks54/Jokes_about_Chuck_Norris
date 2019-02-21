import AddOptWithDb.CheckHystoryId;
import AddOptWithDb.DeletAllJokes;
import AddOptWithDb.SaveJokeWithId;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SaveChekMethodsForDB_Test {
    SaveJokeWithId saveJokeWithId;
    CheckHystoryId checkHystoryId;
    DeletAllJokes deletAllJokes;
    @Before
    public void SetUp(){
        saveJokeWithId = new SaveJokeWithId();
        checkHystoryId = new CheckHystoryId();
        deletAllJokes = new DeletAllJokes();
        deletAllJokes.deletAll();
        boolean saveIdSetUp = saveJokeWithId.SaveJokeWithId("1","just joke");
    }
    @Test
    public void testSaveMethod(){
        boolean saveId = saveJokeWithId.SaveJokeWithId("2","just joke");
        boolean expected = true;
        assertEquals(saveId,expected);
    }
    @Test
    public void testCheckMethod(){
        boolean expected = true;
        boolean chekHystory = checkHystoryId.CheckHyst("1");
        assertEquals(chekHystory,expected);
    }
}
