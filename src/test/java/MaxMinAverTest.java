import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MaxMinAverTest {

        @Test
        public static void MinMaxTest(){

            int[] expectedResult = {7,0,0};


            MaxAvrMin Check = new MaxAvrMin();

            int[] actualResult = Check.MaxAvgMinValue(new int[]{ 7});
            System.out.println(Arrays.toString(actualResult));
            System.out.println(Arrays.toString(expectedResult));


            Assert.assertEquals(actualResult, expectedResult);


        }

    @Test
    public static void MinMaxTest2(){

        int[] expectedResult = {5,3,1};


        MaxAvrMin Check = new MaxAvrMin();

        int[] actualResult = Check.MaxAvgMinValue(new int[]{ 1,2,3,4,5});
        System.out.println(Arrays.toString(actualResult));
        System.out.println(Arrays.toString(expectedResult));


        Assert.assertEquals(actualResult, expectedResult);


    }






}
