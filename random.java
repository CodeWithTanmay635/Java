import java.util.Random;
public class random {
    public static void main(String[] args){


        Random number = new Random();
        Random bool = new Random();
        int num;
        int num1;
        int num2;
        double num3;
        num = number.nextInt(1, 100  );
        num1 = number.nextInt(100, 200  );
        num2 = number.nextInt(200, 300  );
        num3 = number.nextDouble(300, 1000  );

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        boolean  isHead;
        isHead = bool.nextBoolean();

        if(isHead){
            System.out.println("TAILS");
        }
        else{
            System.out.println("HEADS");
        }



    }

}
