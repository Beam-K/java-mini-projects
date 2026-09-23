public class scope_and_decomp_3 {
}

public static void main(String[] args) {


    double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
    double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};
    String name;

    sayHello(name = "Пиксель");

    System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
    System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));

    findMaxExpense(feedExpensesCat);
    findExpensesSum(feedExpensesCat);
    sayEnjoyMeal(name = "Пиксель");


    sayHello(name = "Байт");

    System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
    System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));

    findMaxExpense(feedExpensesHamster);
    findExpensesSum(feedExpensesHamster);
    sayEnjoyMeal(name = "Байт");


}

public static double findMaxExpense(double[] expenses) {

    double max = 0;
    for (int i = 0; i < expenses.length; i++) {
        if (expenses[i] > max) {
            max = expenses[i];
        }
    }

    return max;
}

public static double findExpensesSum(double[] sumFeed) {


    double sum = 0;
    for (int i = 0; i < sumFeed.length; i++) {
        sum = sum + sumFeed[i];
    }

    return sum;

}


public static void sayHello(String name) {
    System.out.println("Привет, " + name + "!");
}

public static void sayEnjoyMeal(String name) {
    System.out.println("Приятного аппетита, " + name + "!");
}




/*


public class Practicum {

    public static void main(String[] args) {
        System.out.println("Привет, Пиксель!");
        System.out.println("Привет, Байт!");

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        double maxFeedExpenseCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            if (feedExpensesCat[i] > maxFeedExpenseCat) {
                maxFeedExpenseCat = feedExpensesCat[i];
            }
        }

        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseCat);

        double maxFeedExpenseHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            if (feedExpensesHamster[i] > maxFeedExpenseHamster) {
                maxFeedExpenseHamster = feedExpensesHamster[i];
            }
        }

        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseHamster);

        double sumFeedCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            sumFeedCat = sumFeedCat + feedExpensesCat[i];
        }

        System.out.println("Всего на корм было потрачено " + sumFeedCat);

        double sumFeedHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
        }

        System.out.println("Всего на корм было потрачено " + sumFeedHamster);

        System.out.println("Приятного аппетита, Пиксель!");
        System.out.println("Приятного аппетита, Байт!");
    }
}

*/