package com.pb.tkachenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Программа поможет выяснить в какой из интервалов от 1 до 100 попадет ваше число");
        System.out.println("Если не передумали это выяснить, введите целое число: ");
        int operand1 = in.nextInt();

        if (operand1 >= 0 && operand1 <= 14) {
            System.out.print("Ваше число попадает в диапазон [0-14]");
        }
        else if (operand1 >= 15 && operand1 <= 35) {
            System.out.print("Ваше число попадает в диапазон [15-35]");
        }
        else if (operand1 >= 36 && operand1 <= 50) {
            System.out.print("Ваше число попадает в диапазон [36-50]");
        }
        else if (operand1 >= 51 && operand1 <= 100) {
            System.out.print("Ваше число попадает в диапазон [51-100]");
        }
        else {
            System.out.print("Ваше число не попало ни в один из дипазонов от 1 до 100");
        }
    }
}
