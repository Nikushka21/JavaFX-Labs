
import java.util.function.Function;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        Function<String, User> userCreator = User::new;

        User user1 = userCreator.apply("Анна");
        User user2 = userCreator.apply("Иван");

        System.out.println("Первый пользователь: "
                + user1.getName());

        System.out.println("Второй пользователь: "
                + user2.getName());
    }
}
