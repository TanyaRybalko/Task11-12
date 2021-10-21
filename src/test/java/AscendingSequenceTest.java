import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AscendingSequenceTest {

/*
    @Test
    public void AscendingSequenceTest (){

        int startNumber = 10;
        int endNumber = 25;
        int step = 5;
        int [] expectedResult = {10,15,20,25};


        //expectedResult = new int[]{10,15,20,25};


        AscendingSequence AscendingCheck = new AscendingSequence();

        int[] actualResult = AscendingCheck.AscendingSequence(startNumber, endNumber, step);
        //System.out.println("Expected result: " + Arrays.toString(expectedResult) + " Actual result: " + Arrays.toString(actualResult) + ".");

                 Assert.assertArrayEquals(actualResult,expectedResult);

    }

*/

    @Test
    public void AscendingSequenceTest1 (){

        int [] actualResult;
        int [] expectedResult;
        int a = 10;
        int b = 10;
        int n = 5;
        expectedResult = new int[]{-1};


        AscendingSequence AscendingCheck = new AscendingSequence();
        actualResult = AscendingCheck.AscendingSequence(a, b, n);
        System.out.println("Expected result: " + Arrays.toString(expectedResult) + " Actual result: " + Arrays.toString(actualResult) + ".");

        Assert.assertArrayEquals(actualResult,expectedResult);

    }



}
