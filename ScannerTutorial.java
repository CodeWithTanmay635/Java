import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

    /**
     * Java Scanner Class Tutorial
     * Author: Professor Claude

     * The Scanner class is part of java.util package and is used to read input
     * from various sources like keyboard, files, strings, etc.
     */

    public class ScannerTutorial {

        public static void main(String[] args) {

            // ===============================
            // LESSON 1: BASIC SCANNER USAGE
            // ===============================

            System.out.println("=== LESSON 1: Reading from Keyboard ===");

            // Creating a Scanner object to read from System.in (keyboard)
            Scanner scanner = new Scanner(System.in);

            // Reading different data types
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();  // Reads entire line including spaces

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();       // Reads an integer

            System.out.print("Enter your height (in meters): ");
            double height = scanner.nextDouble(); // Reads a double

            System.out.print("Are you a student? (true/false): ");
            boolean isStudent = scanner.nextBoolean(); // Reads a boolean

            // Display the information
            System.out.println("\n--- Your Information ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height + " meters");
            System.out.println("Student: " + isStudent);

            // ===============================
            // LESSON 2: COMMON SCANNER METHODS
            // ===============================

            System.out.println("\n=== LESSON 2: Scanner Methods ===");

            // Clear the buffer (important after nextInt(), nextDouble(), etc.)
            scanner.nextLine();

            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            System.out.print("Enter a single word: ");
            String word = scanner.next();  // Reads only until whitespace

            System.out.println("Sentence: " + sentence);
            System.out.println("Word: " + word);

            // ===============================
            // LESSON 3: VALIDATION AND ERROR HANDLING
            // ===============================

            System.out.println("\n=== LESSON 3: Input Validation ===");

            // Safe integer input with validation
            int number = getSafeInteger(scanner, "Enter a valid number: ");
            System.out.println("You entered: " + number);

            // ===============================
            // LESSON 4: PRACTICAL EXAMPLES
            // ===============================

            System.out.println("\n=== LESSON 4: Practical Examples ===");

            // Example 1: Simple Calculator
            simpleCalculator(scanner);

            // Example 2: Grade Calculator
            gradeCalculator(scanner);

            // Example 3: Login System
            loginSystem(scanner);

            // Always close the scanner to prevent resource leak
            scanner.close();

            // ===============================
            // LESSON 5: READING FROM FILES
            // ===============================

            System.out.println("\n=== LESSON 5: Reading from Files ===");
            readFromFile();

            // ===============================
            // LESSON 6: PARSING STRINGS
            // ===============================

            System.out.println("\n=== LESSON 6: Parsing Strings ===");
            parseString();
        }

        /**
         * Method to safely read an integer with validation
         */
        public static int getSafeInteger(Scanner scanner, String prompt) {
            while (true) {
                System.out.print(prompt);
                if (scanner.hasNextInt()) {
                    int value = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    return value;
                } else {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    scanner.nextLine(); // Clear invalid input
                }
            }
        }

        /**
         * Example 1: Simple Calculator
         */
        public static void simpleCalculator(Scanner scanner) {
            System.out.println("\n--- Simple Calculator ---");

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
        }

        /**
         * Example 2: Grade Calculator
         */
        public static void gradeCalculator(Scanner scanner) {
            System.out.println("\n--- Grade Calculator ---");

            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();

            double total = 0;

            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                double marks = scanner.nextDouble();
                total += marks;
            }

            double average = total / subjects;
            String grade;

            if (average >= 90) {
                grade = "A+";
            } else if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
        }

        /**
         * Example 3: Simple Login System
         */
        public static void loginSystem(Scanner scanner) {
            System.out.println("\n--- Login System ---");

            String correctUsername = "student";
            String correctPassword = "bca2024";

            scanner.nextLine(); // Clear buffer

            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome, " + username + "!");
            } else {
                System.out.println("Login failed! Invalid credentials.");
            }
        }

        /**
         * Example: Reading from a file using Scanner
         */
        public static void readFromFile() {
            try {
                // Create a sample file content (in real scenario, you'd have an actual file)
                String fileName = "sample.txt";

                // In a real application, you would use:
                // Scanner fileScanner = new Scanner(new File(fileName));

                // For demonstration, we'll use a string
                String fileContent = "John Doe\n25\n85.5\nMaths Physics Chemistry\nEND";
                Scanner fileScanner = new Scanner(fileContent);

                System.out.println("Reading from file:");

                // Read line by line
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println("Line: " + line);

                    if (line.equals("END")) {
                        break;
                    }
                }

                fileScanner.close();

            } catch (Exception e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }

        /**
         * Example: Parsing strings using Scanner
         */
        public static void parseString() {
            String data = "Alice 23 Computer Science 89.5 true";
            Scanner stringScanner = new Scanner(data);

            System.out.println("Parsing string: " + data);

            String name = stringScanner.next();
            int age = stringScanner.nextInt();
            String course = stringScanner.next();
            String specialization = stringScanner.next();
            double percentage = stringScanner.nextDouble();
            boolean graduated = stringScanner.nextBoolean();

            System.out.println("Parsed data:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course + " " + specialization);
            System.out.println("Percentage: " + percentage);
            System.out.println("Graduated: " + graduated);

            stringScanner.close();
        }
    }

/*
IMPORTANT SCANNER METHODS REFERENCE:

1. INPUT METHODS:
   - next()         : Reads next token (word)
   - nextLine()     : Reads entire line
   - nextInt()      : Reads integer
   - nextDouble()   : Reads double
   - nextFloat()    : Reads float
   - nextBoolean()  : Reads boolean
   - nextByte()     : Reads byte
   - nextShort()    : Reads short
   - nextLong()     : Reads long

2. CHECKING METHODS:
   - hasNext()      : Check if next token available
   - hasNextLine()  : Check if next line available
   - hasNextInt()   : Check if next token is integer
   - hasNextDouble(): Check if next token is double
   - And similar hasNext methods for other types

3. UTILITY METHODS:
   - close()        : Close the scanner
   - delimiter()    : Get current delimiter
   - useDelimiter() : Set delimiter pattern

BEST PRACTICES:
1. Always close Scanner objects to prevent resource leaks
2. Use nextLine() after nextInt(), nextDouble() etc. to clear buffer
3. Validate input using hasNext methods
4. Handle exceptions when reading from files
5. Use try-with-resources for automatic resource management

COMMON PITFALLS:
1. Buffer issues when mixing nextLine() with other next methods
2. Not closing Scanner objects
3. Not handling invalid input
4. InputMismatchException when wrong data type entered
*/
