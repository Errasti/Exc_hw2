package org.example;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        lineChecker();
    }

    public static void lineChecker(){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        if (line.isEmpty()) {
            throw new IllegalArgumentException("Ввод пустых строк недопустим");
        }
    }
}
