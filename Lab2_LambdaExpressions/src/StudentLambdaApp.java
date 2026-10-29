
public class StudentLambdaApp {

    public static void main(String[] args) {

        String groupName = "ИС-21";
        String faculty = "Информационных технологий";
        int course = 2;
        String studyType = "Очная";

        String surname = "Иванов";
        String name = "Иван";
        String patronymic = "Иванович";
        String birthDate = "15.05.2006";
        String phone = "+7 900 123-45-67";
        String email = "ivanov@example.com";

        InfoPrinter groupInfo = () -> {
            System.out.println("=== Студенческая группа ===");
            System.out.println("Название: " + groupName);
            System.out.println("Факультет: " + faculty);
            System.out.println("Курс: " + course);
            System.out.println("Вид обучения: " + studyType);
        };

        InfoPrinter studentInfo = () -> {
            System.out.println("\n=== Информация о студенте ===");
            System.out.println("Фамилия: " + surname);
            System.out.println("Имя: " + name);
            System.out.println("Отчество: " + patronymic);
            System.out.println("Дата рождения: " + birthDate);
            System.out.println("Телефон: " + phone);
            System.out.println("E-mail: " + email);
        };

        groupInfo.printInfo();
        studentInfo.printInfo();
    }
}
