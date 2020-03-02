import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a value: ");
            double number = scanner.nextDouble();
            if (number > 0) {
                numbers.add(number);
            } else {
                flag = false;
            }
        }
        Utils.allMethods(numbers);
    }
}
