public class Main {
    public static void main(String[] args) {
        int vasyaAge = 45;
        int katyaAge = 32;
        int mishaAge = 25;

        int min = -1;
        int middle = -1;
        int max = -1;

        min = Math.min(vasyaAge, Math.min(katyaAge, mishaAge));
        max = Math.max(vasyaAge, Math.max(katyaAge, mishaAge));
        middle = vasyaAge + katyaAge + mishaAge - min - max;

        System.out.println("The youngest of them is " + min + " years old");
        System.out.println("The average of them is " + middle + " years old");
        System.out.println("The oldest of them is " + max + " years old");
    }
}
