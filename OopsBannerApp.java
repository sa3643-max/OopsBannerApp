public class OopsBannerApp {
public static void main(String[] args) {

        // Letter O (7 rows)
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Letter P (7 rows)
        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Letter S (7 rows)
        String[] S = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        // Loop through each row
        for (int i = 0; i < 7; i++) {

            String row = String.join("  ",
                    O[i],   // First O
                    O[i],   // Second O
                    P[i],   // P
                    S[i]    // S
            );

            System.out.println(row);
        }
    }
}
