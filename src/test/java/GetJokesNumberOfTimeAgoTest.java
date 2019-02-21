import AddOptWithDb.GetJokesNumberOfTimeAgo;
import com.sun.javaws.exceptions.InvalidArgumentException;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.fail;


@RunWith(JUnitParamsRunner.class)
public class GetJokesNumberOfTimeAgoTest {

    GetJokesNumberOfTimeAgo getJokesNumberOfTimeAgo ;
    @Before
    public void SetUp(){
        getJokesNumberOfTimeAgo = new GetJokesNumberOfTimeAgo();
    }
            @Test
            @Parameters({
                    "253030",
                    "246130",
                    "006061",
                    "-02349"})
            public void tetsValidParams(String time){
        try{getJokesNumberOfTimeAgo.getPeriodOfTimeAgo(time);
            fail();
        } catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }
}
