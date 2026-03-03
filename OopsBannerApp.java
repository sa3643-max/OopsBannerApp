public class OopsBannerApp {

    public static void main(String[] args) {

        // Creating banner lines using String.join()
        String[] banner = {

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ****** ",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "****** ",
                    " ***** "),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "*     *"),

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    "*      ",
                    " ***** ")
        };

        // Printing banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}