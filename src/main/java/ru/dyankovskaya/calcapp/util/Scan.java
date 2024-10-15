package ru.dyankovskaya.calcapp.util;

import java.util.Scanner;

public class Scan {
    public static void scaner(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println("Выберите арифметическую операцию (+, - или *): ");
        int oper = sc.nextInt();
    }


}
