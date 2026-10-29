
import java.util.function.Consumer;

public class InstanceMethodReferenceExample {

    public void printMessage(String message) {
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {

        InstanceMethodReferenceExample example =
                new InstanceMethodReferenceExample();

        Consumer<String> printer = example::printMessage;

        printer.accept("Изучаем ссылки на нестатические методы");
        printer.accept("Лямбда-выражения в Java");
    }
}
