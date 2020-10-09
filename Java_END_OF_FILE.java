import java.util.Scanner;

public class Java_END_OF_FILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        while (scanner.hasNext()) {
            num++;
            System.out.println(num+" "+ scanner.nextLine());
        }


        }
    }

