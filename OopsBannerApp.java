public class OopsBannerApp {
public static void main(String[] args) {

        // Build the banner lines using static methods
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            // Combine letters for each row
            banner[i] = String.join("  ",
                    getO()[i],   // First O
                    getO()[i],   // Second O
                    getP()[i],   // P
                    getS()[i]    // S
            );
        }

        // Print the final banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method to generate letter O
    public static String[] getO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method to generate letter P
    public static String[] getP() {
        return new String[] {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method to generate letter S
    public static String[] getS() {
        return new String[] {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}
