import  java.util.*;
import java.util.Arrays;
class FindMean{
    public static double[] takeinput(int n,String nam){
        double[] data = new double[n];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Data "+ nam);
        for(int i=0; i<n; i++) data[i] = in.nextDouble();
        return data;
    }
    double calculate(double[] m){
        double sum = 0.0;
        for(double data : m) sum = sum + data;

        return sum/m.length;
    }
    void mean() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Size Of The Data :");
        int size = in.nextInt();
        double[] dataA = takeinput(size, "A");
        double[] dataB = takeinput(size, "B");


        double meanA = calculate(dataA);
        double meanB = calculate(dataB);
        System.out.println(meanA);
        System.out.println(meanB);
        System.out.println(Arrays.toString(dataA));

    }
}

public class mean {
    public static void main(String[] arg){
    FindMean m1 = new FindMean();
    m1.mean();
    }
}
