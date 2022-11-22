public class equation {
    public static void equality(){
        for (int i = 1; i < 70; i++) {
            for (int j = 1; j < 70; j++) {
                if ((2 * i + j * 5) == 69){
                    System.out.printf("Корни уравнения %d, %d\n", i, j);
                }

            }
        }
    }
}
