public class TwoSum {
    public static void main(String[] args){
        int[] a = new int[5];
        System.out.println(a[2]);
        int[] arr={1,2,3,4,5};
        System.out.println(arr instanceof Object);
        int target = 9;
        for(int i=0; i<arr.length; i++ ){
            for(int j=0; j<i+1; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("arr["+i+"]"+" arr["+ j+"]");
                    System.out.println(arr[i] + " "+ arr[j]);
                }
            }
        }
    }
}
