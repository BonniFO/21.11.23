import java.util.ArrayList;
import java.util.Scanner;
//                                   Домашнее задание №3
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        while (!input.equals("q")){// не равно пустой строке
            int elem = Integer.parseInt(input);//выделение целого числа из строки
            arr.add(elem);
            input = scanner.next();
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) != arr.get(i+1)); {
                System.out.println("No");
                return;

            }
        }
        System.out.println("Yes");

    }
}

        int first = scanner.nextInt();
        int input = 0;
        arr.add(first);
        while (first != -1 && input != -1) { //
            input = scanner.nextInt();
            if (first != input) {
                System.out.println("No");
                return;

        }
            arr.add(input);


        }
        System.out.println("Yes");

    }

    }