
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){

        Scanner cart = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?:");
        item = cart.nextLine();

        System.out.print("What's the price of the product?:");
        price = cart.nextDouble();

        System.out.print("How much are you buying?:");
        quantity = cart.nextInt();

        total = price * quantity;
        System.out.println("\n\n");
        System.out.println("\t\t\t\tYour cart");
        System.out.println("You purchase of"+" "+item+" "+"cost you."+"\nprice of"+" "+price+" "+"each."+"\nYour purchasing quantity of"+" "+quantity+" "+item+"\nWill cost you total:"+" "+total+currency);
    }

}
