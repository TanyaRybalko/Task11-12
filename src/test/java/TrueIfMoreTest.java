import org.testng.Assert;
import org.testng.annotations.Test;

public class TrueIfMoreTest {


    @Test
    public void TrueFalse (){

        boolean expectedResult = true;


        TrueIfMore Test = new TrueIfMore();
        boolean actualResult = Test.trueIfMore(23) ;
        Assert.assertEquals(actualResult, expectedResult);


    }



}
