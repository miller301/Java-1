// task 3 Реализовать простой калькулятор

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Scanner oScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = iScanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = iScanner.nextDouble();
        System.out.println("Введите знак операции (+, -, *, /):");
        String operate = oScanner.nextLine();
        iScanner.close();
        oScanner.close();
        boolean corect = true;
        double res = 0;
        switch(operate){
            case "+":
            res = x + y;
            break;
            case "-":
            res = x - y;
            break;
            case "*":
            res = x * y;
            break;
            case "/":
            if(y != 0) res = x / y;
            else {
                System.out.println("Деление на ноль невозможно");
                corect = false;
            }
            break;
        default: 
            System.out.println("Данной операции не существует");
            break;
        }
        if (corect) {
            System.out.printf("%.2f %s %.2f = %.2f", x, operate, y, res);
        }

    }
    
}