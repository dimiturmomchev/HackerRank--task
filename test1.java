import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input % 2 == 1){
            System.out.println("Weird");
        }else if (input % 2 == 0 & input >= 2 & input <= 5){
            System.out.println("Not Weird");
        }else if (input % 2 == 0 & input >=6 & input<= 20){
            System.out.println("Weird");
        }else if (input % 2 == 0 & input>20){
            System.out.println("Not Weird");
        }
    }
}
