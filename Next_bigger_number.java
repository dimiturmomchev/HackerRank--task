import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Next_bigger_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        long input2 = Long.parseLong(input);
        if (input.length() == 1) {
            System.out.println(-1);
        } else {
            String result = input;
            String result2 = input;
            char digit1 = input.charAt(input.length() - 1);
            char digit2 = input.charAt(input.length() - 2);

            result = String.valueOf(digit1) + String.valueOf(digit2);
            result2 = String.valueOf(digit2) + String.valueOf(digit1);

            if (Integer.parseInt(result) <= Integer.parseInt(result2)) {
                System.out.println(-1);
            } else {
                System.out.println(input.replace(result2, result));
            }
        }

    }
    }
