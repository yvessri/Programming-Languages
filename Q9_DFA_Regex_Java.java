import java.util.Scanner;
import java.util.regex.*;

public class Q9_DFA_Regex_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[ab]{4}([ab]{4})*$");
        if (pattern.matcher(input).matches()) {
            System.out.println("Accept");
        } else {
            System.out.println("Reject");
        }
    }
}

