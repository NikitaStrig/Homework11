public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1-3");
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";
        String fullName = middleName + " " + firstName + " " + lastName;
        fullName = fullName.replace("ё", "е");
        String fullNameUpper = fullName.toUpperCase();

        System.out.println(fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
    }
}