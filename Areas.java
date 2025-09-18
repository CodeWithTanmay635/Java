import java.util.Scanner;
class CalculateArea{
    protected double n,m;

    public CalculateArea (double a,double b){
        this.n =a;
        this.m= b;
    }public double rect(){
        return n*m;
    }
}class LengthWidth extends CalculateArea{
    public LengthWidth(Scanner area){
        super (readLen(area),readWid(area));}
        public static double readLen(Scanner area){
        System.out.print("Enter the length :");
        return area.nextDouble();
        }
        public static double readWid(Scanner area){
        System.out.print("Enter the Width :");
        return area.nextDouble();
        }


    }

class CalculationParent {
    protected double num;
    public CalculationParent(double a){
        this.num = a;
    }
    public double square(){
        return this.num*this.num;
    }

}
class AreaOfRectangle extends CalculationParent {

    public AreaOfRectangle(Scanner area) {
            super (readAr(area));}
            public static double readAr(Scanner area){
            System.out.print("Enter The Area ");
            return area.nextDouble();
        }

}
class Circle{
    protected double n;
    public Circle(double a){
        this.n = a;
    }public double area_O_C(){return Math.PI*n*n;}

}class CircleAr extends Circle{
    CircleAr(Scanner Area){
        super(circleA(Area));
    }
    public static double circleA(Scanner Area){
        System.out.print("Enter The Radius :");
        return Area.nextDouble();
    }
}
class Triangle {
    protected double h,l;
    Triangle(double h, double l){this.h = h; this.l = l;}
public double a_o_t(){return 0.5*l*h;}
}class Area_O_T extends Triangle {
    Area_O_T(Scanner at){super (bre(at),hei(at));}
    public static double bre(Scanner at){
        System.out.print("Enter the breadth Of Triangle :");
        return at.nextDouble();
    }public static double hei(Scanner at){
        System.out.print("Enter Height Of Triangle :");
        return at.nextDouble();
    }
}
class Areas {
     static void main (){
        boolean continueCalculating = true;
        Scanner cho = new Scanner(System.in);
        while(continueCalculating) {
        System.out.println("================Area Calculator================");
        System.out.println("1. Area Of Square");
        System.out.println("2. Area Of Rectangle");
        System.out.println("3. Area Of Circle");
        System.out.println("4. Area Of Triangle");
        System.out.println("5. Exit");

        System.out.print("Enter A Choice 1-3 :");

        int choice = cho.nextInt();

            switch(choice){
                case 1:
                    AreaOfRectangle are = new AreaOfRectangle(cho);
                    double result = are.square();
                    System.out.println("Area Of Square"+result);
                    break;
                case 2:
                    LengthWidth lw = new LengthWidth(cho);
                    double rest = lw.rect();
                    System.out.println("Area Of Rectangle :"+rest);
                    break;
                case 3:
                    CircleAr ca = new CircleAr(cho);
                    double ans = ca.area_O_C();
                    System.out.printf("Area Of Circle :%.2f\n",ans);
                    break;
                case 4:
                    Area_O_T at = new Area_O_T(cho);
                    double sol= at.a_o_t();
                    System.out.printf("Area of Triangle :%.2f\n",sol);
                    break;
                case 5:
                    continueCalculating=false;
                    break;




                    }

            }
            cho.close();

        }
    }
