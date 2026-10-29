
public class LambdaReturnExample {

    interface Operation {
        int calculate(int x, int y);
    }

    public static Operation action(String operation) {

        switch (operation) {
            case "sum":
                return (x, y) -> x + y;

            case "subtract":
                return (x, y) -> x - y;

            case "multiply":
                return (x, y) -> x * y;

            default:
                return (x, y) -> 0;
        }
    }

    public static void main(String[] args) {

        Operation addition = action("sum");
        Operation subtraction = action("subtract");
        Operation multiplication = action("multiply");

        System.out.println("Сложение: "
                + addition.calculate(10, 5));

        System.out.println("Вычитание: "
                + subtraction.calculate(10, 5));

        System.out.println("Умножение: "
                + multiplication.calculate(10, 5));
    }
}
