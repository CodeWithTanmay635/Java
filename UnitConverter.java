import java.util.*;
 class MeterToCentimeter{


double meter_cm(){
    Scanner mac = new Scanner(System.in);
     double meter;
     double centim=100;
    System.out.println("Enter Meter :");
    meter = mac.nextDouble();
    double con = meter * centim;
    System.out.println(meter+" = "+ con +"Centimeters ");
    return 0;
}

}

public class UnitConverter {
    public static void main(String[] args){
        MeterToCentimeter m1 = new MeterToCentimeter();
       double ret = m1.meter_cm();
        System.out.println(ret);
        m1.meter_cm();
    }
}
