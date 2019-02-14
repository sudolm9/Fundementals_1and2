import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1; // count which square we're on
        int size = scan.nextInt(); // size of next square
        // System.out.println(size);
        // Expecting -1 at bottom of input file
        while (size != -1) {
            Square square = new Square(size);// create a new Square of the given
                                             // size
            square.readSquare(scan);// call its read method to read the values
                                    // of the square
            System.out.println("\n******** Square " + count + " ********");
            square.printSquare();// print the square
            // print the sums of its rows
            for (int row = 0; row < size; row++) {
                System.out.println("The sum of row " + (row + 1) + " is "
                        + square.sumRow(row));
            }
            // print the sums of its columns
            for (int col = 0; col < size; col++) {
                System.out.println("The sum of col " + (col + 1) + " is "
                        + square.sumCol(col));
            }
            // print the sum of the main diagonal
            System.out.println("The sum of main diagonal is "
                    + square.sumMainDiag());
            // print the sum of the other diagonal
            System.out.println("The sum of the other diagonal is "
                    + square.sumOtherDiag());
            // determine and print whether it is a magic square
            System.out.println("The square "
                    + ((square.magic()) ? "is " : "is not ")
                    + "a magic square.");
            // get size of next square
            size = scan.nextInt();
            count++;
        }
    }
}