import org.junit.Test;

import static java.lang.String.valueOf;
import static junit.framework.TestCase.assertEquals;


/**
 * Created by Yisus95 on 14/9/17.
 */
public class FizzBuzzTest {
    @Test
    public void given_2_should_return_2(){
        assertEquals("2", new FizzBuzz().get(2));
    }

    @Test
    public void given_1_should_return_1(){
        assertEquals("1", new FizzBuzz().get(1));
    }

    @Test
    public void given_3_should_return_Fizz(){
        assertEquals("Fizz", new FizzBuzz().get(3));
    }

    @Test
    public void given_6_should_return_Fizz(){
        assertEquals("Fizz", new FizzBuzz().get(6));
    }


    @Test
    public void given_5_should_return_Buzz(){
        assertEquals("Buzz", new FizzBuzz().get(5));
    }


    @Test
    public void given_15_should_return_FizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().get(5));
    }

    public static class FizzBuzz{

        public static String get(int position) {
            return isMultipleOfFifteen(position) ? "FizzBuzz" :
                    isMultipleOfFive(position) ? "Buzz" :
                    isMultipleOfThree(position) ? "Fizz" :
                    valueOf(position);
        }

        private static boolean isMultipleOfThree(int position) {
            return isMultipleOfFactor(position, 3);
        }

        private static boolean isMultipleOfFive(int position) {
            return isMultipleOfFactor(position, 5);
        }

        private static boolean isMultipleOfFifteen(int position) {
            return isMultipleOfFactor(position, 15);
        }

        private static boolean isMultipleOfFactor(int position, int factor) {
            return position % factor == 0;
        }
    }
}
