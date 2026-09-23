package scope_and_decomp;

import java.util.Scanner;


public class test {
    public static void main(String[] args) {





    }

    static void addNewNumberStepsPerDay() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите номер месяца");
            int numberMonth = scanner.nextInt();

            if (numberMonth <= 12 && numberMonth > 0) {
                System.out.println("вы ввели правильно месяц");

                System.out.println("Введите день от 1 до 30 (включительно)");
                int numberDay = scanner.nextInt();

                if (numberDay <= 30 && numberDay > 0) {
                    System.out.println("вы ввели правильно");

                    System.out.println("Введите количество шагов");
                    int numberStepsPerDay = scanner.nextInt();

                    if (numberStepsPerDay > 0) {
                        System.out.println("вы ввели правильно количество шагов");
                        break;
                    }
                } else {
                    System.out.println("вы ввели неправильно номер дня");
                }

            } else {
                System.out.println("вы ввели хуйню, переделывай");
            }

        }

        }

    }

