import java.util.Scanner;

public class long_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // read the number of words

        for (int i = 0; i < n; i++) {
            String s = scanner.next(); // read the word

            if (s.length() > 10) {
                System.out.println(s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}
