package mini;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class StringCalculatorTest {

    @Test
    public void calculate() {

    }
    @Test
    public void EmptyStringReturnZeroTest() {
        Calculator calculator = new Calculator();
        String input = "";
        int output = calculator.calculate(input);
        int actualOutput = 0;

        Assertions.assertEquals(actualOutput,output);
    }

    @Test
    public void StringToNumberTest() {
        Calculator calculator = new Calculator();
        String[] inputArr = {"1", "12", "123"};

        int[] outputArr = new int[3];

        for(int i = 0; i<3;i++ )
        {
            outputArr[i] = calculator.calculate(inputArr[i]);
        }

        int[] actualOutputArr = {1, 12, 123};

        Assertions.assertArrayEquals(actualOutputArr,outputArr);
    }

    @Test
    public void CommaBetweenNumbersTest() {
        Calculator calculator = new Calculator();
        String[] inputArr = {"1,3", "12,2", "123,5"};

        int[] outputArr = new int[3];

        for(int i = 0; i<3;i++ )
        {
            outputArr[i] = calculator.calculate(inputArr[i]);
        }

        int[] actualOutputArr = {4, 14, 128};

        Assertions.assertArrayEquals(actualOutputArr,outputArr);
    }

    @Test
    public void NewLineBetweenTest() {
        Calculator calculator = new Calculator();
        String[] inputArr = {"1\n3", "12\n2", "123\n5"};

        int[] outputArr = new int[3];

        for(int i = 0; i<3;i++ )
        {
            outputArr[i] = calculator.calculate(inputArr[i]);
        }

        int[] actualOutputArr = {4, 14, 128};

        Assertions.assertArrayEquals(actualOutputArr,outputArr);
    }

    @Test
    public void ThreeNumbersEitherWayTest() {
        Calculator calculator = new Calculator();
        String[] inputArr = {"1\n3,5", "1,2,2", "1\n23\n5"};

        int[] outputArr = new int[3];

        for(int i = 0; i<3;i++ )
        {
            outputArr[i] = calculator.calculate(inputArr[i]);
        }

        int[] actualOutputArr = {9, 5, 29};

        Assertions.assertArrayEquals(actualOutputArr,outputArr);
    }
}