// task 1 Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    public static void main(String [] args) {
    Scanner iScanner = new Scanner (System.in);
    System.out.print("Введите число n "); 
    int n = iScanner.nextInt();
    double tn = 0.5*n*(n+1);
    System.out.printf(" ваше треуголное число равно: %.1f \n", tn);
    double fn = factorial(n);
    System.out.printf("n! = %.1f \n", fn);
  }
    public static double factorial(int n) {
        if (n == 1) return 1;
        return n*factorial(n-1);
        
    }
}