import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputStrings {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядки. Для завершення введіть 'end':");

        // Введення рядків до списку, поки не введено "end"
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            stringList.add(input);
        }

        // Виведення рядків на екран
        System.out.println("Введені рядки:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
