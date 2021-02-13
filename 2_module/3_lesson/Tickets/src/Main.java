public class Main {
    public static void main(String[] args) {
        // Печатает в консоль номера билетов от 200 000 до 210 000 и от 220 000 до 235 000 с использованием for and
        // while

        for (int i = 200000; i <= 235000; i++) {
            if (i <= 210000 || i >= 220000) {
                System.out.println(i);
            }
        }

        int i = 200000;
        while (i < 235001) {
            if (i <= 210000 || i >= 220000) {
                System.out.println(i);
            }
            i++;
        }
    }
}