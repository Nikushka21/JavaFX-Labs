
public class AnonymousComparison {

    public static void main(String[] args) {

        Operationable operation = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int result = operation.calculate(20, 10);
        System.out.println("Результат: " + result);
    }
}
