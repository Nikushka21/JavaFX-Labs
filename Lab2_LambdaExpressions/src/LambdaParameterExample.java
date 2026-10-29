
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaParameterExample {

    public static int sumNumbers(
            List<Integer> numbers,
            Predicate<Integer> condition) {

        int sum = 0;

        for (int number : numbers) {
            if (condition.test(number)) {
                sum += number;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int evenSum = sumNumbers(
                numbers, number -> number % 2 == 0);

        int greaterThanFiveSum = sumNumbers(
                numbers, number -> number > 5);

        System.out.println("Сумма чётных чисел: " + evenSum);
        System.out.println("Сумма чисел больше 5: "
                + greaterThanFiveSum);
    }
}
