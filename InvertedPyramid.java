public class InvertedPyramid {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
