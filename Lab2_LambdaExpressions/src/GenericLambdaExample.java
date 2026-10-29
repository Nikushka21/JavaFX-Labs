
interface GenericOperation<T> {
    T execute(T value);
}

public class GenericLambdaExample {

    public static void main(String[] args) {

        GenericOperation<Integer> numberOperation =
                value -> value * 2;

        GenericOperation<String> textOperation =
                value -> value.toUpperCase();

        System.out.println("Число: "
                + numberOperation.execute(10));

        System.out.println("Строка: "
                + textOperation.execute("java"));
    }
}
