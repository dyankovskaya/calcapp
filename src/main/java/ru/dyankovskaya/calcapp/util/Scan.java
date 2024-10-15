package ru.dyankovskaya.calcapp.util;

import java.util.Scanner;

public class Scan {
    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = sc.nextInt();
        return num1;
    }
}
