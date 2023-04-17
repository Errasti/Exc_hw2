package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float result  = resendNumber();
        System.out.println(result);
        System.out.println();
        reworkedCode();
    }

    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    public static float resendNumber(){
        Scanner scan = new Scanner(System.in);
        float result;
        System.out.println("Введите дробное число: ");
        try {
            result = Float.parseFloat(scan.next()); // Считываем ввод пользователя
        } catch (NumberFormatException e) { // В случае возникновения исключения, информируем пользователя, и запрашиваем ввод повторно
            System.out.println("Некорректный ввод данных. Повторите попытку\n");
            result = resendNumber();
        }
        return result;
    }

    /**
     * Исправленный кусок кода из второй задачи
     */
    public static void reworkedCode(){
        Random random = new Random();
        try {
            int d = random.nextInt(4); // иначе 100% ловили ошибку
            int number = 10; // вместо intArray[8]
            double catchedRes1 = number / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

