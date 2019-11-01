import java.util.*;

class KeyPad {

    private String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        search("23", "");
    }

    public static void search(String digits, String path) {
        if (digits.length() == path.length()) {
            System.out.println(path);
        } else {
            for (int i = 0; i < digits.length(); i++) {
                if (digits.charAt(i) == 2) {
                    search(digits, path + "a");
                    search(digits, path + "b");
                    search(digits, path + "c");
                } else if (digits.charAt(i) == 3) {
                    search(digits, path + "d");
                    search(digits, path + "e");
                    search(digits, path + "f");
                } else if (digits.charAt(i) == 4) {
                    search(digits, path + "g");
                    search(digits, path + "h");
                    search(digits, path + "i");
                } else if (digits.charAt(i) == 5) {
                    search(digits, path + "j");
                    search(digits, path + "k");
                    search(digits, path + "l");
                } else if (digits.charAt(i) == 6) {
                    search(digits, path + "m");
                    search(digits, path + "n");
                    search(digits, path + "o");
                } else if (digits.charAt(i) == 7) {
                    search(digits, path + "p");
                    search(digits, path + "q");
                    search(digits, path + "r");
                    search(digits, path + "s");
                } else if (digits.charAt(i) == 8) {
                    search(digits, path + "t");
                    search(digits, path + "u");
                    search(digits, path + "v");
                } else if (digits.charAt(i) == 9) {
                    search(digits, path + "w");
                    search(digits, path + "x");
                    search(digits, path + "y");
                    search(digits, path + "z");
                }
            }
        }
    }
}
