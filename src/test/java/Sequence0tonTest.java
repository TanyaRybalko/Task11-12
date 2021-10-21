import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Sequence0tonTest {


        @Test
        public void checkNumber (){

            //Исходное число
            int end = 222;
            int expectedResult = 24753;

            Sequence0ton CheckNumber = new Sequence0ton();
            int actualResult = CheckNumber.Sequence(end);

            Assert.assertEquals(actualResult, expectedResult);

                 }




    }
