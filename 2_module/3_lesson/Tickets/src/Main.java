public class Main {
    public static void main(String[] args) {
        // Печатает в консоль номера билетов от 200 000 до 210 000 и от 220 000 до 235 000 с использованием for and
        // while

//        int x = 200000;
//        int y = 220000;
//        for (int i = 0; i < 30000; i++) {
//            if (i < 10001) {
//                System.out.println(x);
//                x++;
//            }
//            if (i > 19998) {
//                System.out.println(y);
//                y++;
//            }
//        }

        int k = 0;
        int m = 200000;
        int n = 220000;
        while (k < 30000) {
            if (k < 10001) {
                System.out.println(m);
                m++;
            }
            if (k > 19998) {
                System.out.println(n);
                n++;
            }
            k++;
        }

//        for (int n = 220000; n < 235001; n++) {
//            System.out.println(n);
//        }
//
//        int j = 200000;
//        while (j < 210001) {
//            System.out.println(j);
//            j++;
//        }
//
//        int k = 220000;
//        while (k < 235001) {
//            System.out.println(k);
//            k++;
//        }
    }
}