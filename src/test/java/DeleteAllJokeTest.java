import com.pl.jokes_about_chuck_norris.AddOptWithDb.DeletAllJokes;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class DeleteAllJokeTest {
    DeletAllJokes deletAllJokes;

    @Before
    public void SetUp() {
        deletAllJokes = new DeletAllJokes();
    }

    @Test
    public void testDeletAllJokes() {
        boolean answer = deletAllJokes.deletAll();
        boolean expected = true;
        assertEquals(answer, expected);
    }
}
