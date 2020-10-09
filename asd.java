import java.util.*;
import java.util.function.Consumer;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <4  ; i++) {
            list.add(scanner.nextLine());
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}