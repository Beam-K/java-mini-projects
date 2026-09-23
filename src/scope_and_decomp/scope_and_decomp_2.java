


import java.util.Scanner;

public class scope_and_decomp_2 {
}

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Какую зарплату вы получите в этом месяце?");
    int salary = scanner.nextInt();
    System.out.println("Сколько планируете потратить на транспорт?");
    int transportMoney = scanner.nextInt();
    System.out.println("Сколько запланировано на супермаркеты?");
    int foodMoney = scanner.nextInt();
    System.out.println("Какую сумму хотите отложить?");
    int savings = scanner.nextInt();

    correctExpenses(salary, transportMoney, foodMoney, savings); // вызовите метод correctExpenses с правильными аргументами

    // Напечатайте запланированные траты
    System.out.println("Вы планировали потратить: транспорт — " + transportMoney + ", "
            + "еда — " + foodMoney + ", "
            + "сбережения — " + savings + ".");
}

public static int correctExpenses(int salary, int transportMoney, int foodMoney, int savings) { // объявите метод correctExpenses
    // тело метода дано ниже
    int leftMoney = 0;
    int expensesSum = transportMoney + foodMoney + savings; // считаем расходы


    if (expensesSum > salary) { // проверяем, не превышают ли расходы зарплату
        int lackMoney = expensesSum - salary; // считаем, сколько не хватает
        leftMoney = salary - expensesSum; // считаем излишек средств

        // пока не начнёт хватать денег на транспорт — сокращаем траты на 100 рублей
        while ((salary - foodMoney) < transportMoney) {
            foodMoney = foodMoney - 100;
        }
        // если не хватает денег на жизнь — не откладываем
        if (transportMoney + foodMoney + savings > salary) {
            savings = 0;
        }

        // печатаем рекомендации
        System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
        System.out.println("Рекомендуемые траты: "
                + "еда — " + foodMoney + ", "
                + "сбережения — " + savings + ".");
    } else {
        leftMoney = salary - expensesSum;
        System.out.println("В этом месяце дебет с кредитом сошлись!");
        System.out.println("Свободных средств " + leftMoney);
    }
    return leftMoney;

}







/*
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую зарплату вы получите в этом месяце?");
        int salary = scanner.nextInt();
        System.out.println("Сколько планируете потратить на транспорт?");
        int transportMoney = scanner.nextInt();
        System.out.println("Сколько запланировано на супермаркеты?");
        int foodMoney = scanner.nextInt();
        System.out.println("Какую сумму хотите отложить?");
        int savings = scanner.nextInt();

        ... // вызовите метод correctExpenses с правильными аргументами

        // Напечатайте запланированные траты
        System.out.println("Вы планировали потратить: транспорт — " + ... + ", "
                + "еда — " + ... + ", "
                + "сбережения — " + ... + ".");
    }

    ... // объявите метод correctExpenses
    // тело метода дано ниже

        int expensesSum = transportMoney + foodMoney + savings; // считаем расходы
        if (expensesSum > salary) { // проверяем, не превышают ли расходы зарплату
            int lackMoney = expensesSum - salary; // считаем, сколько не хватает
            int leftMoney = salary - expensesSum; // считаем излишек средств

            // пока не начнёт хватать денег на транспорт — сокращаем траты на 100 рублей
            while ((salary - foodMoney) < transportMoney) {
                foodMoney = foodMoney - 100;
            }
            // если не хватает денег на жизнь — не откладываем
            if (transportMoney + foodMoney + savings > salary) {
                savings = 0;
            }

            // печатаем рекомендации
            System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
            System.out.println("Рекомендуемые траты: "
                    + "еда — " + ... + ", "
                    + "сбережения — " + ... + ".");
        } else {
            System.out.println("В этом месяце дебет с кредитом сошлись!");
            System.out.println("Свободных средств " + leftMoney);
        }

}


*/