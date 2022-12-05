public class Main {
    public static void main(String[] args) {
        System.out.println("Задание  1");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        String fullNameUpper = fullName.toUpperCase();
        System.out.println(fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
    }
}