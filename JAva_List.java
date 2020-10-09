import java.util.LinkedList;
import java.util.Scanner;

public class JAva_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scanner.next();
            if (action.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
