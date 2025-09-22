import java.util.*;
import java.lang.Math;
 class Guess {
void guess(){
    Scanner num = new Scanner(System.in);
    int rand = (int)(Math.random() * 100);
    System.out.println("!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!= Welcome To Number Guessing Game !=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=");
    int n;
    int nog=0;
    System.out.print("Enter Your Name : ");
    String name = num.next();
    do {
        System.out.print("\nEnter guessed number :");
        n = num.nextInt();
        nog++;
        if(n < rand){
            System.out.println("\nEntered Number Is Smaller!! ");
        }else if(n>rand){
            System.out.println("Entered Number Is Bigger!! ");
        }else{
            System.out.println("Congratulations you guessed the number in "+nog+" Guesses");
        }

    }while (n != rand);
    if(nog>=20){
        System.out.println("Bad Guessing "+name);

    }    else if(nog>=10){
        System.out.println("Not Bad "+name);
    }else if(nog>=5){
        System.out.println("Impressive "+name);
    }else if(nog>=0){
        System.out.println("Excellent "+name);
    }

}
}
class GuessNumber{
     public static void main(String[] args){
         Guess g = new Guess();
         g.guess();
     }
}