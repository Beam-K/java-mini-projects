package methods;

public class methods_4 {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

    // объявите метод findMaxExpense
    public static double findMaxExpense(double[] expenses) {
        // реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
        double maxExpense = 0;
        for (int i = 0; i < expenses[i]; i++) {

            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i]; // самую большую трату запишите в переменную maxExpense
            }

    }

        return maxExpense;

    }
}


//ниже исходный текст задания

/*
public class Practicum {

	public static void main(String[] args) {
		double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
		double maxExpense = ... // вызовите метод и присвойте maxExpense значение его результата
		System.out.println("Самая большая трата недели " + maxExpense);
	}

	... // объявите метод findMaxExpense
	... // реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
  ... // самую большую трату запишите в переменную maxExpense

}

}*/