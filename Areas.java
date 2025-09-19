import java.util.Scanner;
class Areas {

    public static void main (String[] args){
       
        boolean continueCalculating = true;
        Scanner cho = new Scanner(System.in);
        while(continueCalculating) {
           displayMenu();
            System.out.print("Enter A Choice 1-3 :");

            int choice = cho.nextInt();

            switch(choice){
                case 0://exit
                    continueCalculating=false;
                    break;
                case 1://Square
                    AreaOfSquare are = new AreaOfSquare(cho);
                    are.square();
                    break;
                case 2://Rectangle
                      LengthWidth lw = new LengthWidth(cho);
                      lw.rect();
                      break;
                case 3://Circle
                    CircleAr ca = new CircleAr(cho);
                     ca.area_O_C();

                    break;
                case 4://Triangle
                    Area_O_T at = new Area_O_T(cho);
                    at.a_o_t();

                    break;
                case 5://Parallelogram
                    par p = new BaseHeight(cho);
                   p.base();
                   p.height();
                    p.calPar();
                    break;
                case 6://Trapezium
                    shape s = new tri(cho);
                    s.bas1();
                    s.bas2();
                    s.hei();
                    s.a_o_tr();

                    break;
                 default:
                    System.out.println("Invalid choice! Please select a valid option.");


            }


        }
        cho.close();

    }

    private static void displayMenu(){
        System.out.println("\n📐 Select a shape to calculate area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Trapezium");
        System.out.println("0. Exit");
        System.out.print("\nEnter your choice: ");
    }
    

}
//Rectangle{
class CalculateArea{
    protected double n,m;

    public CalculateArea (double a,double b){
        this.n =a;
        this.m= b;
    }public double rect(){
        System.out.println("\n🔲 Rectangle Area Calculator");

        System.out.println("Length of rectangle :"+n);
        System.out.println("Breadth of rectangle :"+m);
        System.out.println("Formula for area of rectangle :");
        System.out.println("Area = length x Breadth");
        System.out.println("Area = "+n+" x "+m);

                System.out.print("Area :"+n*m);
                return 0;
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


    }//}

//Square{
class CalculationParent {
    protected double num;
    public CalculationParent(double a){
        this.num = a;
    }
    public double square(){
        System.out.println("\n⬜ Square Area Calculator");
        System.out.println("Sides of square :"+num);
        System.out.println("Formula for area of a square :");
        System.out.println("Area = side^2");
        System.out.println("Area ="+num*num);
        return 0;
    }

}
class AreaOfSquare extends CalculationParent {

    public AreaOfSquare(Scanner area) {
            super (readAr(area));}
            public static double readAr(Scanner area){
            System.out.print("Enter The Area ");
            return area.nextDouble();
        }

}//}
//Circle{
class Circle1{
    protected double n;
    public Circle1(double a){
        this.n = a;
    }public double area_O_C(){
        System.out.println("\n⭕ Circle Area Calculator");
        System.out.println("Radius Of Circle :"+n);
        System.out.println("The Value Of π :"+Math.PI);
        System.out.println("Formula For Area Of Circle :");
        System.out.println("Area = π x rR^2");
        System.out.println("Area = "+Math.PI+" x ("+n+"*"+n+")");
        System.out.println("Area ="+Math.PI*(n*n));

        return 0;}

}class CircleAr extends Circle1{
    CircleAr(Scanner Area){
        super(circleA(Area));
    }
    public static double circleA(Scanner Area){
        System.out.print("Enter The Radius :");
        return Area.nextDouble();
    }
}//}

//Triangle{
class Triangle {
    protected double h,l;
    Triangle(double h, double l){this.h = h; this.l = l;}
public double a_o_t(){
    System.out.println();
    System.out.println("\"\\uD83D\uDD3A Triangle Area Calculator\"");
    System.out.println("Breadth Of Triangle :"+h);
    System.out.println("Height Of Triangle :"+l);
    System.out.println("Formula For Area Of Triangle :");
    System.out.println("Area = Breadth x Height");
    System.out.println("Area = "+h+" x "+l);
    System.out.println("Area ="+((h*l)*0.5));
        return 0;}
}class Area_O_T extends Triangle {
    Area_O_T(Scanner at){super (bre(at),hei(at));}
    public static double bre(Scanner at){
        System.out.print("Enter the breadth Of Triangle :");
        return at.nextDouble();
    }public static double hei(Scanner at){
        System.out.print("Enter Height Of Triangle :");
        return at.nextDouble();
    }
}//}

//Trapezium{
interface shape{
    double bas1();
    double bas2();
    double hei();
double a_o_tr ();

}abstract class tip implements shape{
protected double h,a,b;
tip(double a, double b, double h){
    this.a=a;
    this.b=b;
    this.h=h;
}public double a_o_tr (){
        System.out.println("⏢ Area of Trapezium");
        System.out.println("The Base(1) Of Trapezium :"+a);
        System.out.println("The Base(2) Of Trapezium :"+b);
        System.out.println("The Height Of Trapezium :"+h);
        System.out.println("Formula For Area Of Trapezium :");
        System.out.println("Area = ((base1 + base2)/2) x height");
        System.out.println("Area = (("+a+" + "+b+")/2)"+" x "+h);
        System.out.println("Area ="+((a+b)*0.5)*h);
    return 0;}
}  class tri extends tip{
    tri(Scanner trp){super(bas1(trp),bas2(trp),hei(trp));}
    public static double bas1(Scanner trp){
        System.out.println("Enter the base(a) of the Trapezium :");
        return trp.nextDouble();
    }public static double bas2(Scanner trp){
        System.out.println("Enter the base(b) of the Trapezium :");
        return trp.nextDouble();
    }public static double hei(Scanner trp){
        System.out.println("Enter the Height(h) of the Trapezium :");
        return trp.nextDouble();
    }
    public double bas1(){return a;}
    public double bas2(){return b;}
    public double hei(){return h;}
}//}
//Parallelogram{
interface par{
    double base();
    double height();
    double calPar();
}
abstract class Parallel implements par{
    protected double b,h;
    Parallel(double b,double h){
        this.b = b;
        this.h = h;
    }public double calPar(){
        System.out.println("🔷 Area Of Parallelogram");
        System.out.println("Base Of The Parallelogram :"+b);
        System.out.println("Height Of The Parallelogram :"+h);
        System.out.println("Formula For Area Of Parallelogram :");
        System.out.println("Area = Base x Height");
        System.out.println("Area ="+b+" x "+h);
        System.out.println("Area ="+(b*h));
        return 0;
    }
}class BaseHeight extends Parallel{
    BaseHeight(Scanner par){ super (base(par),height(par)); }
    public static double base(Scanner par){
        System.out.println("Enter The Base Of The Parallelogram :");
        return par.nextDouble();
    }
    public static double height(Scanner par){
        System.out.println("Enter The Pase Of The Parallelogram :");
        return par.nextDouble();
    }
    public double base(){return b;}
    public double height(){return h;}
}

