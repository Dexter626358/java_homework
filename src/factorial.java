import java.util.Scanner;

public class factorial {
    public static void getFactorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        long factorial = 1;
        if (number == 0 || number == 1) {
            System.out.println("Факториал числа равен 1");
        } else {
            for (int i = 1; i <= number ; i++) {
                factorial *= i;
            }
            System.out.println("Факториал " + number + " равен: " + factorial);
        }
        scan.close();
    }
}
