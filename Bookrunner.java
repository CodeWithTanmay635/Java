public class Bookrunner {
    public static void main (String[] args)
    {
    Book artofjava = new Book();
    Book effectivejava = new Book();
    Book loveforCode = new Book();
    artofjava.inStock();
    effectivejava.outOfStock();
    loveforCode.inStock();
artofjava.setPrice(199);
        System.out.println(artofjava.getPrice());
effectivejava.setPrice(344);
        System.out.println(effectivejava.getPrice());
loveforCode.setPrice(499);
        System.out.println(loveforCode.getPrice());


    }
}