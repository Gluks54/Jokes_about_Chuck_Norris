import AddOptWithDb.GetJokesNumberOfTimeAgo;
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
                    "243030,232424",
                    "236130,232424",
                    "006061,232424",
                    "-02349,232424",

                    "232424,253030",
                    "232424,246130",
                    "232424,006061",
                    "232424,-02349"})
            public void tetsValidParams(String start,String end){
        try{getJokesNumberOfTimeAgo.getJokes(start,end);
            fail();
        } catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }
}
