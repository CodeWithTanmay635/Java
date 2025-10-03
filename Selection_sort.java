import java.util.Arrays;
import java.util.Scanner;
public class Selection_sort {

    void select(int[] arr,int n){

        for(int i=0; i<=n-2; i++) {
            int min = i;
            for (int j = i+1; j <= n - 1; j++) {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i]= arr[min];
            arr[min] = temp;
        }

    }

}
class Select{
    public static void main(String[] args){

        Scanner select = new Scanner(System.in);
        System.out.print("\nEnter a number for size of array:");
        int n =  select.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter Elements :");
        for(int i=0; i<n; i++)arr[i] = select.nextInt();
        Selection_sort s1 = new Selection_sort();
        for(int i=1; i<=50; i++) System.out.println(" ");
        System.out.print("\nSorted Elements :"+Arrays.toString(arr));
            s1.select(arr, n);

        System.out.print("\nSorted Elements :"+Arrays.toString(arr));
select.close();
    }
}