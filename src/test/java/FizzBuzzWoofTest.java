import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzWoofTest {

    @Test
    public void checkFizzBuzzWoof(){

        String expectedResult = "1,2,Fizz,Fizz,4,Buzz,Fizz,Fizz,Fizz,Fizz,8,Fizz,Buzz,11,Fizz,Fizz,Fizz,Fizz,Buzz,Fizz,16,Fizz,Fizz,19,Buzz,Fizz,Fizz,22,Fizz,";

        FizzBuzzWoof newFizz = new FizzBuzzWoof();

        String actualResult = newFizz.FizzBuzzWoof( 23);

        Assert.assertEquals(actualResult, expectedResult);






    }
}
