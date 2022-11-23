import java.util.Scanner;
public class equation {
    public static void equality(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите коэффициенты уравнения q, w, e: ");
        boolean flag = false;
        System.out.println("Введите q: ");
        String num1 = scan.next();
        System.out.println("Введите w: ");
        String num2 = scan.next();
        System.out.println("Введите e: ");
        String num3 = scan.next();
        int q = Integer.parseInt(num1);
        int w = Integer.parseInt(num2);
        int e = Integer.parseInt(num3);
        for (int i = 1; i < e; i++) {
            for (int j = 1; j < e; j++) {
                if ((q * i + j * w) == e){
                    System.out.printf("Корни уравнения %d, %d\n", i, j);
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("Корней нет");
        }
        scan.close();
    }
}
