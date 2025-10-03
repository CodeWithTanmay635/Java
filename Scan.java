
import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
        Scanner age = new Scanner(System.in);
        System.out.println("Enter Your age :");
        int a = age.nextInt();
        System.out.println("Enter Your name :");
        String name = age.next();
        System.out.println("Enter your goal :");
        String goal = age.next();
        System.out.println("What is your current education :");
        String edu = age.next();
        System.out.println("Enter your grades");
        double gra = age.nextDouble();
        System.out.println("Your name is"+name+"Your are "+a+" years old you are studying "+edu+" and your goal is to be an "+goal+"you got "+gra+" in your 1st year");

    }
}
