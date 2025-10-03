

public class Fibonacci {
    public static void main(String[] args){

        Fib f1 = new Fib(0,1);

    }
    }
class Fib{

int n1,n2,n3;
    int N=10;

Fib(int a,int b){
    n1=a;
    n2=b;
 for (int i=0; i<N; i++){
     System.out.print(n1+" ");
     n3 = n2 + n1;
     n1 = n2;
     n2 = n3;
 }
    }

}
