# Matrix Determinant & Cramer's Rule Solver

This Java program allows you to input a 3x3 matrix and a constants vector, then computes the determinant of the matrix and solves a system of three linear equations using Cramer's Rule.

## Features

- Input any size matrix (main logic assumes 3x3 for determinant and solving).
- Prints the entered matrix and the index of each element.
- Calculates the determinant of a 3x3 matrix.
- Checks if the system has a unique solution (i.e., if the determinant is non-zero).
- Uses Cramer's Rule to solve for variables `x`, `y`, and `z` in the system:
  ```
  Ax = b
  ```
  where `A` is your coefficient matrix and `b` is the constants vector.

## How It Works

1. **Input Dimensions and Elements:**
    - Prompts for the number of rows and columns.
    - Accepts matrix elements from user input.

2. **Display:**
    - Prints the matrix and its indices for clarity.

3. **Determinant Calculation:**
    - Computes the determinant if the matrix is 3x3.

4. **Cramer's Rule:**
    - Prompts for the constants vector (`b`).
    - Calculates Dx, Dy, Dz by replacing respective columns with `b`.
    - Computes solutions for `x`, `y`, and `z`:
      ```
      x = Dx/det(A)
      y = Dy/det(A)
      z = Dz/det(A)
      ```

## Sample Output

```
=================Matrices=================
Enter the number of rows in matrix :
3
Enter the number of columns in Matrix :
3
Enter The Elements :
1 2 3
4 5 6
7 8 9
==============================
Matrix of Array :
1.0 2.0 3.0  
4.0 5.0 6.0  
7.0 8.0 9.0  
==============================
Index of array elements:
[0][0] [0][1] [0][2] 
[1][0] [1][1] [1][2] 
[2][0] [2][1] [2][2] 
======================================================
Determinant Of matrix is : 0.00
No unique solution exits (det(Matrix) = 0)
```

## How to Run

1. Make sure you have Java installed (`java` and `javac` commands).
2. Save `Matrix.java` to a directory.
3. Open a terminal in that directory.
4. Compile the program:
   ```
   javac Matrix.java
   ```
5. Run the compiled class:
   ```
   java Matrix
   ```

## Notes

- **Only works for 3x3 matrices for determinant and Cramer's Rule solving.**
- Enter the coefficients and constants as prompted.
- If the determinant is zero, the system does not have a unique solution.

## License

This project is licensed under the MIT License.

---

**Author:** [CodeWithTanmay635](https://github.com/CodeWithTanmay635)
