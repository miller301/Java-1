// Task 2 Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        System.out.println("Все простые числа от 1 до 1000: ");
        for(int i = 2; i <= 1000; i++) {
            int count = 0;
            for(int j = 1; j < i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1){
                System.out.printf("%d, ", i);
            }
        }
        
    }
    
}