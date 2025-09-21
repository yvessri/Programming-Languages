import java.util.Scanner;

public class Q5_FA_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        int state = 0;
        boolean error = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (state) {
                case 0:
                    if (ch == 'a') state = 1;
                    else if (ch == 'b') state = 2;
                    else error = true;
                    break;
                case 1:
                    if (ch == 'b') state = 3;
                    else error = true;
                    break;
                case 2:
                    if (ch == 'a') state = 1;
                    else if (ch == 'b') state = 2;
                    else error = true;
                    break;
                case 3:
                    if (ch == 'b') state = 3;
                    else error = true;
                    break;
                default:
                    error = true;
                    break;
            }
            if (error) break;
        }

        if (error) {
            System.out.println("Input error\nReject");
        } else if (state == 3) {
            System.out.println("Accept");
        } else {
            System.out.println("Reject");
        }
    }
}
