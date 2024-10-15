package ru.dyankovskaya.calcapp._main;

import ru.dyankovskaya.calcapp.service.ResultWriterService;
import ru.dyankovskaya.calcapp.util.Calculator;
import ru.dyankovskaya.calcapp.util.Scan;

public class Main {
    public static void main(String[] args) {
      int a = Scan.scanner();
      int b = Scan.scanner();
      int sumres = Calculator.sum(a, b);
      ResultWriterService.printResult("Сложение: ", a, '+', b, sumres);
      int subtractres = Calculator.subtract(a, b);
      ResultWriterService.printResult("Вычитание: ", a, '-', b, subtractres);
      int multiplyres = Calculator.multiply(a, b);
      ResultWriterService.printResult("Умножение: ", a, '*', b, multiplyres);
    }
}

