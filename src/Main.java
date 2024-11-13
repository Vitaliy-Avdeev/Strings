public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var taskOne = ("Задача №1, №2, №3, №4");
        System.out.println(taskOne);
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName1);

        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);


    }
}