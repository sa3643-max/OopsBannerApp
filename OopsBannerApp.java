public class OopsBannerApp {
 public static void main(String[] args) {

        // Combine array declaration + initialization using String.join()
        String[] banner = {
                String.join("  ", " ***** ", " ***** ", "****** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*     *", "*     *"),
                String.join("  ", "*     *", "*     *", "*     *", "*      "),
                String.join("  ", "*     *", "*     *", "****** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*      ", "      *"),
                String.join("  ", "*     *", "*     *", "*      ", "*     *"),
                String.join("  ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Enhanced for-loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
