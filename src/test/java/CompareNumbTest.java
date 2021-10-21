import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareNumbTest {

    @Test
    public static void CheckNumber(){

        String expectedResult = "Good number";

        MultipleNumber CheckNumbers = new MultipleNumber();

        String actualResult = CheckNumbers.MultipleNumber(15);

        Assert.assertEquals(actualResult, expectedResult);


    }
}
