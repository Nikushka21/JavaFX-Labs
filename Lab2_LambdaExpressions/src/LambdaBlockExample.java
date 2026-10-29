
interface Calculator {
    int calculate(int x, int y);
}

public class LambdaBlockExample {

    public static void main(String[] args) {

        int multiplier = 2;

        Calculator addition = (x, y) -> {
            int sum = x + y;
            return sum * multiplier;
        };

        Calculator subtraction = (x, y) -> {
            int difference = x - y;
            return difference;
        };

        System.out.println("Сложение с умножением: "
                + addition.calculate(10, 5));

        System.out.println("Вычитание: "
                + subtraction.calculate(10, 5));
    }
}
