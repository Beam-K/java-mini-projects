package loops;
import java.util.Scanner;

public class loops_5 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Оцените работу приложения Зеленоглазое-Такси по шкале от 1 до 3");

            while (true) { // запускаем бесконечный цикл
                int x = scanner.nextInt(); // получаем оценку от пользователя

                if (x == 1) { //если пользователь вводит 1
                    System.out.println("Спасибо за вашу оценку. Мы станем лучше!"); // Благодарим
                    break; // выходим из цикла
                }
                if (x == 2) { // если оценка равна 2
                    System.out.println("Спасибо за вашу оценку. Есть куда расти!");
                    break; // и выходим из цикла
                }
                if (x == 3) { // если оценка равна 3
                    System.out.println("Спасибо за высокую оценку! Рады, что вы выбрали нас!");
                    break; // и выходим из цикла
                }
                // пользователь ввёл не 1, 2 или 3 - повторяем просьбу
                System.out.println("Ваша оценка должна быть в диапазоне от 1 до 3");
            }
        }
    }

