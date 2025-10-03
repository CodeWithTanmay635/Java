import java.util.Scanner;   
public class madLibs {                  
    //program of mad libs 
    public static void main(String[] args){
        Scanner adjective = new Scanner(System.in);
        Scanner noun = new Scanner(System.in);
        System.out.print("Enter an adjective [Describing a Place]:");
        String adjective1 = adjective.nextLine();

        System.out.print("Enter an adjective [Place you like or live in]:");
        String Place = adjective.nextLine();
        
        System.out.print("Add a adjective [Describing a person]:");
        String adjective2 = adjective.nextLine();

        System.out.print("Enter a noun [Name of the person]:");
        String noun1 = noun.nextLine();

        System.out.print("Enter a verb[Action made by the person]:");
        String noun2 = noun.nextLine();
        
        System.out.print("Enter a Number [describing how much that person ate]:");
        int number = noun.nextInt();
        noun.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter a plural noun[Describing a breakfast item]:");
        String noun3 = noun.nextLine();

        System.out.println("\nOnce upon a time, in the"+" "+ adjective1 + " "+"city of"+" "+ Place +" "+",there lived a"+" "+ adjective2 +" "+"young person named"+" "+ noun1+". "+"Every morning, they would"+ " "+ noun2 +" "+ "out of bed and eat"+ " "+ number +" "+ noun3 + " "+ "for breakfast.");
        
        adjective.close();
        noun.close();    
    }

}
