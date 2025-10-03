import java.util.Scanner;

class Dish {
    String code;
    String name;
    int price;

    // Constructor
    Dish(String c, String n, int p) {
        code = c;
        name = n;
        price = p;
    }
}

public class New {

    // Function to initialize menu
    public static Dish[] initializeMenu() {
        Dish[] menu = new Dish[5];  // you can increase size for more dishes
        menu[0] = new Dish("D01", "Dal Fry", 120);
        menu[1] = new Dish("M02", "Masala Dosa", 90);
        menu[2] = new Dish("P03", "Paneer Tikka", 180);
        menu[3] = new Dish("B04", "Butter Naan", 40);
        menu[4] = new Dish("C05", "Cold Coffee", 70);
        return menu;
    }

    // Function to calculate total bill
    public static double calculateBill(Dish[] menu, String[] orderedCodes, int[] quantities) {
        double total = 0;
        for (int i = 0; i < orderedCodes.length; i++) {
            for (Dish dish : menu) {
                if (dish.code.equals(orderedCodes[i])) {
                    total += dish.price * quantities[i];
                    break;  // dish found, no need to check further
                }
            }
        }
        return total;
    }

    // Function to display the bill
    public static void displayBill(String[] orderedCodes, int[] quantities, Dish[] menu, double total) {
        System.out.println("\nCode\tDish\t\tQuantity\tPrice\t\tItem Total");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < orderedCodes.length; i++) {
            for (Dish dish : menu) {
                if (dish.code.equals(orderedCodes[i])) {
                    int itemTotal = dish.price * quantities[i];
                    System.out.println(dish.code + "\t" + dish.name + "\t\t" + quantities[i] + "\t\t" + dish.price + "\t" + itemTotal);
                    break;
                }
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Grand Total: " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Initialize menu
        Dish[] menu = initializeMenu();

        // Step 2: Take order from cashier
        System.out.print("Enter number of items ordered: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] orderedCodes = new String[n];
        int[] quantities = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter code of item " + (i + 1) + ": ");
            orderedCodes[i] = sc.nextLine().toUpperCase();  // case-insensitive
            System.out.print("Enter quantity of " + orderedCodes[i] + ": ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // Step 3: Calculate total
        double total = calculateBill(menu, orderedCodes, quantities);

        // Step 4: Display bill
        displayBill(orderedCodes, quantities, menu, total);

        sc.close();
    }
}
