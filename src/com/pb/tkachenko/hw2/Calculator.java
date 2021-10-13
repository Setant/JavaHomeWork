package com.pb.tkachenko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Это первая версия простого калькулятора.");
        System.out.println("Она сможет умножить, разделить, сложить и вычесть 2 заданых Вами числа.");
        System.out.println("Для начала введите первое целое число: ");
        int operand1 = in.nextInt();

        System.out.println("Теперь введите второе целое число: ");
        int operand2 = in.nextInt();

        System.out.println("Чтобы получить результат осталось выбрать арифметический знак.");
        System.out.println("Пожалуйста, введите один из следующих знаков:");
        System.out.println("Умножение - '*'");
        System.out.println("Деление - '/'");
        System.out.println("Сложение - '+'");
        System.out.println("Вычитание - '-'");
        String sign = in.next();


        switch (sign) {
            case "*":
                System.out.println("Ваш результат: " + (operand1*operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Делить на 0 нельзя!");
                } else {

                    System.out.println("Ваш результат: " + (float)operand1/operand2);
                }
                break;
            case "+":
                System.out.println("Ваш результат: " + (operand1+operand2));
                break;
            case "-":
                System.out.println("Ваш результат: " + (operand1-operand2));
                break;
            default:
                System.out.println("Введен не корректный арифметический знак");
        }

    }
}
