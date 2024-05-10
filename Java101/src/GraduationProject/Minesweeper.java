package GraduationProject;

import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Minesweeper!!!");
        System.out.println("Before we start, please enter the dimensions...\n==============");
        int gameBoardRows, gameBoardColumns, numberOfMines;
        boolean isGameReadyToStart = false;
        boolean isWin = false;
        do {
            System.out.print("Number of Rows: ");
            gameBoardRows = scanner.nextInt();
            System.out.print("Number of Columns: ");
            gameBoardColumns = scanner.nextInt();

            if (gameBoardColumns >= 2 && gameBoardRows >= 2) {
                isGameReadyToStart = true;
                System.out.println("Game Starts!!!");
            } else {
                isGameReadyToStart = false;
                System.out.println("Game cannot start with these dimensions!!!");
                System.out.println("Minimum Dimensions: 2 X 2");
            }

        } while(!isGameReadyToStart);


        numberOfMines = gameBoardRows * gameBoardColumns / 4;
        int[][] mineIndices = new int[numberOfMines][2];
        for (int m = 0; m < numberOfMines; m++) {
            mineIndices[m][0] = -1;
            mineIndices[m][1] = -1;
        }


        int m = 0;
        while (m < numberOfMines) {
            int mineRow = (int) (Math.random() * gameBoardRows);
            int mineColumn = (int) (Math.random() * gameBoardColumns);
            if (isEmpty(mineRow, mineColumn, mineIndices)) {
                mineIndices[m][0] = mineRow;
                mineIndices[m][1] = mineColumn;
                m++;
            }
        }

        String[][] gameBoard= new String[gameBoardRows][gameBoardColumns];
        for (int r = 0; r < gameBoardRows; r++) {
            for (int c = 0; c < gameBoardColumns; c++) {
                if (isEmpty(r, c, mineIndices)) {
                    gameBoard[r][c] = " - ";
                } else {
                    gameBoard[r][c] = " * ";
                }
                System.out.print(" - ");
            }
            System.out.println("");
        }
        System.out.println("==============");



        int userRow, userColumn;
        int maxGuessNumber = gameBoardColumns * gameBoardRows;
        int[][] enteredIndices = new int[maxGuessNumber][2];
        for (int g = 0; g < maxGuessNumber; g++) {
            enteredIndices[g][0] = -1;
            enteredIndices[g][1] = -1;
        }

        int userGuessCount = 0;
        do {
            System.out.print("Enter row: ");
            userRow = scanner.nextInt();
            System.out.print("Enter column: ");
            userColumn = scanner.nextInt();
            if (0 <= userRow && userRow < gameBoardRows && 0 <= userColumn && userColumn < gameBoardColumns) {
                // play
                if (isEmpty(userRow, userColumn, mineIndices)) {
                    if (isEmpty(userRow, userColumn, enteredIndices)) {
                        int adjacentUnit = checkAdjacentUnits(userRow, userColumn, gameBoard);
                        gameBoard[userRow][userColumn] = " " + adjacentUnit + " ";
                        enteredIndices[userGuessCount][0] = userRow;
                        enteredIndices[userGuessCount++][1] = userColumn;

                    } else {
                        System.out.println("You have entered those dimensions before!!!");
                    }
                    System.out.println("==============");
                    drawGameBoard(userRow,userColumn, gameBoard);
                    System.out.println("==============");
                    if (userGuessCount == maxGuessNumber - numberOfMines) {
                        System.out.println("You Won!!!");
                        isWin = true;
                    }
                } else {
                    isWin = true;
                    System.out.println("==============");
                    drawGameBoard(userRow,userColumn, gameBoard);
                    System.out.println("==============");
                    System.out.println("Game Over");
                }
            } else {
                System.out.println("Dimensions are not in boundaries!!!");
                System.out.println("Row: [0, " + (gameBoardRows - 1) + "]");
                System.out.println("Column: [0, " + (gameBoardColumns - 1) + "]");
            }

        } while (!isWin);

    }

    public static boolean isEmpty(int r, int c, int[][] arr) {
        for (int[] row : arr) {
            if (row[0] == r && row[1] == c ) {
                return false;
            }
        }
        return true;
    }

    public static void drawGameBoard(int rIndex, int cIndex, String[][] board) {
        int rowLength = board.length;
        int columnLength = board[0].length;
        for (int r = 0; r < rowLength; r++ ) {
            for (int c = 0; c < columnLength; c++) {
                if (r == rIndex && c == cIndex) {
                    System.out.print(board[rIndex][cIndex]);
                } else if (" * ".equals(board[r][c])) {
                    System.out.print(" - ");
                } else {
                    System.out.print(board[r][c]);
                }
            }
            System.out.println("");
        }

    }

    public static int checkAdjacentUnits(int rIndex, int cIndex, String[][] board) {
        int rowLength = board.length;
        int columnLength = board[0].length;
        int mineNumbers = 0;
        int rowCheck;
        int colCheck;
        for (int r = -1; r <= 1; r++) {
            for (int c = -1; c <= 1; c++) {
                rowCheck = rIndex + r;
                colCheck = cIndex + c;
                if (0 <= rowCheck && rowCheck < rowLength && 0 <= colCheck && colCheck < columnLength && " * ".equals(board[rowCheck][colCheck])) {
                    mineNumbers++;
                }
            }
        }
        return mineNumbers;
    }


}
