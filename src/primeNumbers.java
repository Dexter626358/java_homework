public class primeNumbers {
    public static void primeNumbers(){
        boolean flag = false;
        int number = 1000;
        for (int i = 2; i <= number; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }


            }
            if (flag == false){
                System.out.print(i + " ");
            }
            flag = false;
        }

    }
}
