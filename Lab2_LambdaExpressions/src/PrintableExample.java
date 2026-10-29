
interface Printable {
    void print(String s);
}

public class PrintableExample {

    public static void main(String[] args) {

        Printable printer = s -> System.out.println(s);

        printer.print("Hello Java!");
        printer.print("Лямбда-выражение работает!");
    }
}
