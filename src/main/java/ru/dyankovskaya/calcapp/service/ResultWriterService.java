package ru.dyankovskaya.calcapp.service;

public class ResultWriterService {
    public static void printResult(String operation, int num1, char action, int num2, int res) {
        System.out.println(operation + num1 + " " + action + " " + num2 + " = " + res);

    }
}