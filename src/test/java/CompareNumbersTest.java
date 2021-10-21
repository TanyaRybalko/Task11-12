import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareNumbersTest {


    @Test
    public void CheckNumber (){

       int expectedResult = 0;

       EqualsOrNot CheckNumb= new EqualsOrNot();
       int actualResult = CheckNumb.CompareNumbers(0, 0);
        Assert.assertEquals(actualResult, expectedResult);


    }


}
