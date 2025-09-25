import javax.xml.namespace.QName;
import java.util.*;
class items{
    private final Scanner bill = new Scanner(System.in);
   void takeInputs(){
        System.out.print("Enter number of items:");
        int items = bill.nextInt();
        double[] rate = new double[items];
        int[] quantity = new int[items];
       String[] name = new String[items];
        for(int i=0; i<items; i++){
            System.out.print("Enter item "+ (i+1) +" name :");
             name[i] = bill.next();
            System.out.print("Enter Quantity :");
           quantity[i] = bill.nextInt();
            System.out.print("Enter The Price :");
            rate[i] = bill.nextDouble();

        }
        double[] total = new double[items];
      double grandTotal = 0;
      for(int i=0; i<items; i++ ){
          total[i] = quantity[i] * rate[i];
          grandTotal+=total[i];

      }
       System.out.println("-------------------------------------------");
       System.out.println("\t\t\tWelcome To Java Mart");
       System.out.println("-------------------------------------------");
       System.out.println("Item name\tQty \t amt\t\tTotal");
       System.out.println("-------------------------------------------");
       for(int i=0; i<items; i++){
       System.out.printf("%-10s\t%d \t\t%.2f \t\t%.2f\n", name[i],quantity[i],rate[i],total[i] );
       }
       System.out.println("-------------------------------------------");
       System.out.printf("Sub Total : %.2f\n",grandTotal);
        double gst = 5.0;
        double gstAmount = (gst /100)* grandTotal;
       System.out.printf("GST  : %.2frs\n",gstAmount);
       double subTotal = gstAmount+grandTotal;
       System.out.printf("Grand Total : %.2f\n",subTotal);
   }

}
public class Billing {
public static void main(String[] args){
items it = new items();
it.takeInputs();
}
}
