
public class LambdaApp {

    public static void main(String[] args) {

        Operationable operation1 = (x, y) -> x + y;
        Operationable operation2 = (x, y) -> x - y;
        Operationable operation3 = (x, y) -> x * y;

        System.out.println("Сложение: "
                + operation1.calculate(20, 10));

        System.out.println("Вычитание: "
                + operation2.calculate(20, 10));

        System.out.println("Умножение: "
                + operation3.calculate(20, 10));
    }
}
