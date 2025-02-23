package Calc;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Please enter first number...");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please enter second number...");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Please enter character: +,-,/,*");
        char operation = new Scanner(System.in).next().charAt(0);

        int c = 0;

        if (operation == '+') {
            c = a + b;

        } else if (operation == '-') {

            c = a - b;
        } else if (operation == '*') {

            c = a * b;
        } else if (operation == '/') {
            c = a / b;
        } else {
            System.out.println("Please enter only the recommended characters!!!");
        }
        System.out.println("Result is " + c);
    }
}
