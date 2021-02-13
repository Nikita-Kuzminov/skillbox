public class Main {
    public static void main(String[] args) {
        // Печатает в консоль номера билетов от 200 000 до 210 000 и от 220 000 до 235 000 с использованием for and
        // while

        for (int i = 200000; i < 210001; i++) {
            System.out.println(i);
        }

        int j = 200000;
        while (j < 210001) {
            System.out.println(j);
            j++;
        }

        for (int n = 220000; n < 235001; n++) {
            System.out.println(n);
        }

        int k = 220000;
        while (k < 235001) {
            System.out.println(k);
            k++;
        }
    }
}