public class CursorControl {
    public static void clearScreen() {
        System.out.print("\033[2J");
    }

    public static void moveCursor(int row, int col) {
        System.out.print("\033[" + row + ";" + col + "H");
    }

    public static void main(String[] args) {
        clearScreen();

        // Draw a simple 5x5 grid
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5; col++) {
                moveCursor(row, col * 2); // col*2 for spacing
                System.out.print(".");
            }
        }

        // Place a player at position (3,3)
        moveCursor(3, 6); // 3*2 = 6
        System.out.print("P");

        // Move cursor to bottom so we don't mess up the grid
        moveCursor(10, 1);
    }
}