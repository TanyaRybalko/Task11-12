import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void oddEven1Test() {
        //Arrange
        OddEven oddEvenCheck = new OddEven();
        String actualResult;
        String expectedResult;
        long testData;

        expectedResult = "Odd";
        testData = -345;

        //Act
        actualResult = oddEvenCheck.oddEven(testData);

        System.out.println("Expectrd result =" + expectedResult + ". Actual result " + actualResult + "." );

        //Assert
        Assert.assertEquals(expectedResult , actualResult);
    }


    @Test
    public void oddEven2Test(){
        OddEven oddEvenCheck = new OddEven();
        String actualResult;
        String expectedResult;
        long testData;

        expectedResult = "Even";
        testData = 0;
        actualResult = oddEvenCheck.oddEven(testData);

        System.out.println("Expectrd result =" + expectedResult + ". Actual result " + actualResult + "." );
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oddEven3Test(){
        OddEven oddEvenCheck = new OddEven();
        String actualResult;
        String expectedResult;
        long testData;

        expectedResult = "Even";
        testData = 222222;

        actualResult = oddEvenCheck.oddEven(testData);
        System.out.println("Expectrd result =" + expectedResult + ". Actual result " + actualResult + "." );
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oddEven4Test(){
        OddEven oddEvenCheck = new OddEven();
        String actualResult;
        String expectedResult;
        long testData;

        expectedResult = "Undefined";
        testData = 2147483647L + 1;

        actualResult = oddEvenCheck.oddEven(testData);
        System.out.println("Expectrd result =" + expectedResult + ". Actual result " + actualResult + "." );
        Assert.assertEquals(expectedResult, actualResult);
    }

}
