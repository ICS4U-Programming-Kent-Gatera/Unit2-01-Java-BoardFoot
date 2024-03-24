import java.util.Scanner;

/**
 * My program calculates the length, so that the result is exactly 1 board foot.
 *
 * @author  Kent Gatera
 * @version 1.0
 * @since   2024-March-22
 */

public final class BoardFoot {

    /**
    * Pleases the style checker.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */

    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is where the main code will be.
     *
     * @param width The width of the board foot.
     * @param height The length of the board foot.
     * @return returns the board length value.
     */
    public static int calculateBoardFoot(int width, int height) {
        // 144 cm^3 is how big a board foot is
        final int boardFoot = 144;
        // Formula to calculate length of a board foot.
        final int boardLength = boardFoot / (width * height);
        // returning the answer.
        return boardLength;
    }

    /**
     * This is where the input/output code will be.
     *
     * @param args
     *
     */

    public static void main(String[] args) {
        try {
            // Initializing scanner
            final Scanner in = new Scanner(System.in);
            // Getting input for height and width.
            System.out.print("What is the width of the board foot?(cm): ");
            final int boardFootWidth = in.nextInt();
            System.out.print("What is the length of the board foot?(cm): ");
            final int boardFootLength = in.nextInt();
            // Printing the results.
            System.out.printf(
                    "The board foot must be %,d cm long"
                    + "for it to have a volume of 144 cm^3.\n",
                    calculateBoardFoot(boardFootWidth, boardFootLength));
            // Closing the input object.
            in.close();
        } catch (Exception e) {
            // Handle exception.
            System.out.println("Your input must be a whole number.");
        }
    }
}
