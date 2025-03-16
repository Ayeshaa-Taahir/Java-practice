import java.util.Scanner;

class EscapeGame {
    private static final char[][] maze = {
        {'P', '.', '.', '#', '.'},
        {'.', '#', '.', '#', '.'},
        {'.', '#', '.', '.', '.'},
        {'#', '.', '#', '#', '.'},
        {'.', '.', '.', '#', 'E'}
    };
    private static int playerX = 0, playerY = 0;
    
    private static void displayMaze() {
        for (char[] row : maze) {
            for (char cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }

    private static boolean movePlayer(char move) {
        int newX = playerX, newY = playerY;
        if (move == 'W') newX--;
        else if (move == 'S') newX++;
        else if (move == 'A') newY--;
        else if (move == 'D') newY++;

        if (newX >= 0 && newX < 5 && newY >= 0 && newY < 5 && maze[newX][newY] != '#') {
            maze[playerX][playerY] = '.';
            playerX = newX;
            playerY = newY;
            if (maze[playerX][playerY] == 'E') return true;
            maze[playerX][playerY] = 'P';
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escape the Maze! Use W A S D to move. Reach 'E' to win.");

        while (true) {
            displayMaze();
            System.out.print("Move (W/A/S/D): ");
            char move = scanner.next().toUpperCase().charAt(0);
            if (movePlayer(move)) {
                System.out.println("🎉 You escaped the maze! Congratulations!");
                break;
            }
        }
        scanner.close();
    }
}