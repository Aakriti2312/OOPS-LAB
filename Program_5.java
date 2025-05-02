import java.util.Scanner;

class Chef {
    public void makeSpecialDish() {
        System.out.println("The chef is making a special dish.");
    }
}

// Subclass ItalianChef overriding makeSpecialDish()
class ItalianChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making pasta");
    }
}

// Subclass ChineseChef overriding makeSpecialDish()
class ChineseChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making dumplings");
    }
}

// Subclass MexicanChef overriding makeSpecialDish()
class MexicanChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Making tacos");
    }
}

public class Program_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Chef[] chefs = new Chef[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Choose a chef type (1: Italian, 2: Chinese, 3: Mexican): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    chefs[i] = new ItalianChef();
                    break;
                case 2:
                    chefs[i] = new ChineseChef();
                    break;
                case 3:
                    chefs[i] = new MexicanChef();
                    break;
                default:
                    System.out.println("Invalid choice, defaulting to a generic chef.");
                    chefs[i] = new Chef();
            }
        }


        System.out.println("\nSpecial dishes being made:");
        for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }

        scanner.close();
    }
}