package loops;

public class loops_2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Круг " + i);
            if (i % 2 == 0) {
                // выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
                // если да, то присесть 5 раз
                for (int numberSquats = 1; numberSquats <= 5; numberSquats++) {
                    System.out.println("  Приседаем " + numberSquats);
                }
            } else {
                // иначе нужно отжаться 3 раза
                for (int numberPushUps = 1; numberPushUps <= 3; numberPushUps++)
                    System.out.println("  Отжимаемся " + numberPushUps);
            }

            for (int numberTrainingAbdominal = 1; numberTrainingAbdominal <= 7; numberTrainingAbdominal++)
                // независимо от номера круга качаем пресс 7 раз
                System.out.println("  Качаем пресс " + numberTrainingAbdominal);

            // небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");
        }

        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
