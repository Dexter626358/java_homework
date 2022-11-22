import java.util.Scanner;

public class calculator {
    public static void calculator(){
        System.out.println("Калькулятор умеет делать простые операции над целыми числами");
        Scanner scan = new Scanner(System.in);
        while (true){
            int number1;
            int number2;
            System.out.println("Введите первое число: ");
            if (scan.hasNextInt()) {
                number1 = scan.nextInt();
            } else {
                System.out.println("Вы ввели не целое число");
                continue;

            }
            System.out.println("Введите второе число: ");
            if (scan.hasNextInt()) {
                number2 = scan.nextInt();
            } else {
                System.out.println("Вы ввели не целое число");
                continue;

            }
            System.out.println("Введите операцию: '+' - сложение, '-' - вычитание, '*' - умножение, '/' - деление");
            String operation = scan.next();
            if (operation.equals("+")){
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            } else if (operation.equals("-")){
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            } else if (operation.equals("*")) {
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            } else if (operation.equals("/")) {
                if (number2 != 0) {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                } else {
                    System.out.println("Деление на ноль");

                }

            } else{
                System.out.println("Некорректный ввоод");
            }

        }

    }
}
