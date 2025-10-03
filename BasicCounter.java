import java.util.Arrays;
import java.util.Scanner;
public class BasicCounter {
  static void reverse(int[] rev, int n){

      for(int i =0; i<n/2; i++){
          int temp = rev[n-i-1];
          rev[n-i-1] = rev[i];
          rev[i] = temp;

      }

      System.out.println(Arrays.toString(rev));
  }

    public static void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[(i+k)%n] = nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = num[i];
        }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
       /* int m =2;

        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr,m);

*/
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = num.nextInt();
        int max = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }

        }
        System.out.println(max);
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
       // int k =2;
         //   System.out.println(min);
      //  rotate(ar1r,k);

int target = 9;
for(int i=0; i< arr1.length; i++){
    for(int j=0; j<i+1; i++){
        if(arr1[i] + arr1[j]==target){
            System.out.println("i["+i+"]"+" "+"j["+j+"]");
            System.out.println("i["+i+"] :"+arr1[i]+" "+"j["+j+"] :"+arr1[j]);
        }
    }
}

       // reverse(arr,n);

    }

    }


