public class sqrt {
    int num;
    int sq;
     sqrt(int n)
    {
        num = n;
        sq = num * num;
    }
    void dis()
    {
        System.out.println("Square of the number is: "+ sq);
    }
    public static void main (String[] args)
    {
       sqrt s1 = new sqrt(12);
       s1.dis();
    }
}

