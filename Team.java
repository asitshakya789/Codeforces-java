import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // read the number of test cases

        int number = 0; // initialize the number of valid test cases

        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt(); // read Petya's score
            int vasya = scanner.nextInt(); // read Vasya's score
            int tonya = scanner.nextInt(); // read Tonya's score

            if (petya + vasya + tonya >= 2) {
                number++; // increment the number of valid test cases
            }
        }

        System.out.println(number); // print the number of valid test cases
    }
}