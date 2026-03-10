import java.util.*;

public class OopsBannerApp {

    // Static Inner Class to hold character and its pattern
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        List<CharacterPattern> patternList = new ArrayList<>();

        // O pattern
        patternList.add(new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        // P pattern
        patternList.add(new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        // S pattern
        patternList.add(new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        printBanner(word, patternList);
    }

    public static void printBanner(String word, List<CharacterPattern> patterns) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPattern cp : patterns) {

                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[i]).append("  ");
                        break;
                    }
                }
            }

            System.out.println(line);
        }
    }
}