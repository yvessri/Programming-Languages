import java.util.Scanner;
import java.util.regex.*;

public class Q6_FA_Regex_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        // FA Pattern: starts with a, followed by at least two b's
        Pattern pattern = Pattern.compile("^(a|b)*abb+");

        if (pattern.matcher(input).matches()) {
            System.out.println("Accept");
        } else {
            System.out.println("Reject");
        }
    }
}


