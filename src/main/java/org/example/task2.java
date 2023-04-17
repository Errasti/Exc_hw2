package org.example;

public class task2 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        //} catch (NullPointerException ex) { закомментировано, тк данная ошибка невозможна
        //    System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {  // стоял в первом блоке catch, что недопустимо т.к Throwable является суперклассом всех ошибок и исключений, соответственно не может быть "выше" наследников
        System.out.println("Что-то пошло не так...");
    }
}

    public static void printSum(Integer a, Integer b) { //  FileNotFoundException - здесь ни к чему ( удален из кода )
        System.out.println(a + b);
    }
    }
