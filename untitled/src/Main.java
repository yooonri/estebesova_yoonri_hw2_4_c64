import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 имен");
        for (int i = 0; i < 5; i++) {
            listA.add(i, scanner.next());
        }
        System.out.println("Введите 5 фамилий");
        for (int i = 0; i < 5; i++) {
            listB.add(i, scanner.next());
        }
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Полный список : " + listC);
    }
}