package methods;

import java.util.Scanner;


public class methods_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static void welcomeUserByName() { // объявите метод welcomeUserByName
        System.out.println("Как вас зовут?");
        String name = scanner.next();// сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() {// объявите метод sayHelloByTime
        System.out.println("Который час?"); // спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
        int currentHour = scanner.nextInt();
        if (currentHour >= 22 || currentHour < 6) {// в зависимости от времени предусмотрите печать приветствий
            System.out.println("Доброй ночи!");
        } else if (currentHour >= 6 && currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour >= 12 && currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour >= 18 && currentHour < 22) {
            System.out.println("Добрый вечер!");
        }


    }

    // объявите метод printSuccess
    public static void printSuccess() {
        // метод printSuccess должен печатать строку "У вас уже неплохо получается программировать!"
        System.out.println("У вас уже неплохо получается программировать!");
    }

}

//ниже исходный текст задания

/*import java.util.Scanner;

public class Practicum {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    ... { // объявите метод welcomeUserByName
        System.out.println("Как вас зовут?");
				... // сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    ...// объявите метод sayHelloByTime
            ...// спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
            ...// в зависимости от времени предусмотрите печать приветствий
            ...
            ...
            ...


            ... // объявите метод printSuccess
            ... // метод printSuccess должен печатать строку "У вас уже неплохо получается программировать!"


}*/