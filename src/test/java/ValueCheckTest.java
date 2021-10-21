import org.junit.Assert;
import org.testng.annotations.Test;

public class ValueCheck {


    @Test
    public void Max(){

        //Исходное число
        int first = 3333;
        int second = 2222;

        int expectedResult = 9999;
        MaxValue test1 = new MaxValue();


        int actualResult = test1.Max(first, second);



        Assert.assertEquals(actualResult, expectedResult);

    }



}
