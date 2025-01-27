public class TicTacToe {
    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char currentPlayer = 'X';
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                if (checkWinner(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("This spot is taken!");
            }
        }
        scanner.close();
    }

    static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print("|" + cell);
            }
            System.out.println("|");
        }
    }

    static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
}
