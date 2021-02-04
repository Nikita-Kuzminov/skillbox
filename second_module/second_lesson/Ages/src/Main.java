public class Main {
    public static void main(String[] args) {
        int vasyaAge = 45;
        int katyaAge = 32;
        int mishaAge = 25;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) {
            min = vasyaAge;
        }
        if (vasyaAge > katyaAge && vasyaAge < mishaAge) {
            middle = vasyaAge;
        } 
        if (vasyaAge < katyaAge && vasyaAge > mishaAge) {
            middle = vasyaAge;
        } 
        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
        } 
        if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            min = katyaAge;
        } 
        if (katyaAge > vasyaAge && katyaAge < mishaAge) {
            middle = katyaAge;
        }
        if (katyaAge < vasyaAge && katyaAge > mishaAge) {
            middle = katyaAge;
        }
        if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
        }
        if (mishaAge < katyaAge && mishaAge < vasyaAge) {
            min = mishaAge;
        }
        if (mishaAge > katyaAge && mishaAge < vasyaAge) {
            middle = mishaAge;
        }
        if (mishaAge < katyaAge && mishaAge > vasyaAge) {
            middle = mishaAge;
        }
        if (mishaAge > katyaAge && mishaAge > vasyaAge) {
            max = mishaAge;
        }

        System.out.println("The youngest of them is " + min + " years old");
        System.out.println("The average of them is " + middle + " years old");
        System.out.println("The oldest of them is " + max + " years old");
    }
}
