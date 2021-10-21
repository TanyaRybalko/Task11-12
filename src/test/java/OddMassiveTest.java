import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddMassiveTest {

    @Test
    public void OddMassiveTest1 (){

        //Исходный массив
        int[] array = {-45, 590,234,985, 12, 68};
        //waited massive
        int[] expectedMassive = {590, 985, 68};

        OddMassive NewCheck = new OddMassive();

        int[] actualResult = NewCheck.OddMassive(array);

        System.out.println("expected:" + Arrays.toString(expectedMassive));
        System.out.println("actual: " + Arrays.toString(actualResult));

        Assert.assertArrayEquals(expectedMassive, actualResult);

/*Odd
        int [] actualResult;
        int [] expectedResult;
        int [] b = new int[]{12, 456, 22, 44};
        int c = 10;
        int n = 5;
        expectedResult = new int[]{-1};


        AscendingSequence AscendingCheck = new AscendingSequence();
        actualResult = AscendingCheck.AscendingSequence(a, b, n);
        System.out.println("Expected result: " + Arrays.toString(expectedResult) + " Actual result: " + Arrays.toString(actualResult) + ".");

        Assert.assertArrayEquals(actualResult,expectedResult);
*/
    }

}
