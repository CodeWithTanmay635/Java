import java.util.Scanner;
public class Matrix{
    static Scanner mat = new Scanner(System.in);


    public static double det(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[2][1] * m[1][2]) - m[0][1] * (m[1][0] * m[2][2] - m[2][0] * m[1][2]) + m[0][2] * (m[1][0] * m[2][1] - m[2][0] * m[1][1]);

    }
    public static void main(String[] args) {

        System.out.println("=======================Matrices=======================");
        System.out.println("Enter the number of rows in matrix :");
        int row = mat.nextInt();

        System.out.println("Enter the number of columns in Matrix :");
        int column = mat.nextInt();
        double[][] m = new double[row][column];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                m[i][j] = mat.nextDouble();
            }
        }
        System.out.println("======================================================");
        System.out.println("Matrix of Array :");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("======================================================");
        System.out.println("Index of array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " ");
            }
            System.out.println();
        }

        double detA = det(m);
        if (detA == 0) {
            System.out.println("No unique solution exits (det(Matrix) = 0");
            return;
        } else {
            System.out.println("======================================================");
            System.out.printf("Determinant Of matrix is : %.2f", detA);
            System.out.println();
        }
        System.out.println("======================================================");
        System.out.println("To find Dx, Dy, & Dz Enter Constants Of the Matrix :");
        double[] b = new double[3];
        for (int i = 0; i < 3; i++) b[i] = mat.nextDouble();
        double[][] Dx = {
                {b[0], m[0][1], m[0][2]},
                {b[1], m[1][1], m[1][2]},
                {b[2], m[2][1], m[2][2]}
        };
        double dx = det(Dx);
        System.out.println("Dx :" + dx);
        System.out.println();

        double[][] Dy = {
                {m[0][0], b[0], m[0][2]},
                {m[1][0], b[1], m[1][2]},
                {m[2][0], b[2], m[2][2]}
        };
        double dy = det(Dy);
        System.out.println("Dy :" + dy);
        System.out.println();
        double[][] Dz = {
                {m[0][0], m[0][1], b[0]},
                {m[1][0], m[1][1], b[1]},
                {m[2][0], m[2][1], b[2]}
        };
        double dz = det(Dz);
        System.out.println("Dz :" + dz);
        System.out.println();

        double x= dx/detA;
        System.out.println("------------ Finding X ------------");
        System.out.println("x:");
        System.out.println(dx+"/"+detA);
        System.out.printf("x : %.2f",x);
        System.out.println();
        double y= dy/detA;
        System.out.println("------------ Finding Y ------------");
        System.out.println("y:");
        System.out.println(dy+"/"+detA);
        System.out.printf("y :%.2f",y);
        System.out.println();
        double z= dz/detA;
        System.out.println("------------ Finding Z ------------");
        System.out.println("z:");
        System.out.println(dz+"/"+detA);
        System.out.printf("z :%.2f",z);
        System.out.println();
    }
}
/*## Sample Output

```
=======================Matrices=======================
Enter the number of rows in matrix :
3
Enter the number of columns in Matrix :
3
Enter The Elements :
1 2 3
4 5 6
7 8 9
======================================================
Matrix of Array :
1.0 2.0 3.0  
4.0 5.0 6.0  
7.0 8.0 9.0  
======================================================
Index of array elements:
[0][0] [0][1] [0][2] 
[1][0] [1][1] [1][2] 
[2][0] [2][1] [2][2] 
No unique solution exits (det(Matrix) = 0
```
*/
/*=======================Matrices=======================
Enter the number of rows in matrix :
3
Enter the number of columns in Matrix :
3
Enter The Elements :
1 2 1
3 5 1
0 1 1
======================================================
Matrix of Array :
1.0 2.0 1.0  
3.0 5.0 1.0  
0.0 1.0 1.0  
======================================================
Index of array elements:
[0][0] [0][1] [0][2] 
[1][0] [1][1] [1][2] 
[2][0] [2][1] [2][2] 
======================================================
Determinant Of matrix is : 1.00
======================================================
To find Dx, Dy, & Dz Enter Constants Of the Matrix :
1
3
5
Dx :-14.0

Dy :10.0

Dz :-5.0

------------ Finding X ------------
x:
-14.0/1.0
x : -14.00
------------ Finding Y ------------
y:
10.0/1.0
y :10.00
------------ Finding Z ------------
z:
-5.0/1.0
z :-5.00*/
