
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceExample {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        List<String> messages = Arrays.asList(
                "Изучаем Java",
                "Лямбда-выражения",
                "Ссылки на методы"
        );

        System.out.println("Способ 1: лямбда-выражение");

        messages.forEach(message ->
                MethodReferenceExample.printMessage(message));

        System.out.println("\nСпособ 2: ссылка на метод");

        Consumer<String> printer =
                MethodReferenceExample::printMessage;

        messages.forEach(printer);
    }
}
