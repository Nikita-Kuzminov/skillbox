
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 450; // ml
        int powderAmount = 500; // g
        int eggsCount = 7; // items
        int sugarAmount = 5; // g
        int oilAmount = 100; // ml
        int appleCount = 1000;

        boolean makeOmelette = false;
        boolean makeApplePie = false;
        boolean makePancake = false;

        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            makePancake = true;
        }

        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            makeOmelette = true;
        }

        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            makeApplePie = true;
        }

        if (makePancake || makeOmelette || makeApplePie) {

            //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            if (makePancake) {
                System.out.println("You can make a pancake");
            }

            //milk - 300 ml, powder - 5 g, eggs - 5
            if (makeOmelette) {
                System.out.println("You can make an omelette");
            }

            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            if (makeApplePie) {
                System.out.println("You can make an apple pie");
            }
        } else {
            System.out.println("You can't cook anything");
        }
    }
}