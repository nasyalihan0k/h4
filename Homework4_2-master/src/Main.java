import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 имен: ");
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println("Список А: "+ A);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите еще 5 имен: ");
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            B.add(scanner1.nextLine());
        }
        System.out.println("Список B: " + B);

        ArrayList<String> C = new ArrayList<>();
        Collections.reverse(B);
        C.add(A.get(0));
        C.add(B.get(0));
        C.add(A.get(1));
        C.add(B.get(1));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(3));
        C.add(A.get(4));
        C.add(B.get(4));
        System.out.println(C);

        Collections.sort(C, new Comp());
        System.out.println("Отсортированный  C список по длинне слова: " + C);





    }
}