import java.io.IOException;
import java.util.Scanner;

/**Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Вывести все простые числа от 1 до 1000
        Реализовать простой калькулятор
        *+Задано уравнение вида q + w = e, где q, w, e >= 0.
 *  Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 *  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
 *  что его нет.
**/
public class Main {
    public static void main(String[] args) throws IOException {
        //triangleNumber();
        //factorial.getFactorial();
        //primeNumbers.primeNumbers();
        //calculator.calculatorDouble();
        //equation.equality();
    }

    public static void triangleNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        int tringleNumber = 0;
        for (int i=1; i <= number; i++) {
            tringleNumber += i;
        }
        System.out.printf("Результат равен: %d", tringleNumber);
        scan.close();
    }
}