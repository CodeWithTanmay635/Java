import java.util.Scanner;

public class input {
public static void main(String[] args){



    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your name=");
    String name = scanner.nextLine();

    System.out.print("Enter your age :");
    int age = scanner.nextInt();


    System.out.print("What is your gpa: ");
    double gpa = scanner.nextDouble();
    System.out.println("Are you a student? (ture/false):");
    boolean isStudent = scanner.nextBoolean();
    System.out.println("Hello "+ name);
    System.out.println("Your Gpa is "+ gpa);
    System.out.print("your age is "+ age);

    if (isStudent){
        System.out.println("\nYou are enrolled as a Student");
    }
else {
        System.out.println("\nYou are NOT enrolled as a Student");
    }
        scanner.close();


    }
}
