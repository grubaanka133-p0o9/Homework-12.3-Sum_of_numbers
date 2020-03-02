import java.util.ArrayList;

public class Utils {
    public static void reverse(ArrayList<Number> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void sum(ArrayList<Number> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "+");
            sum = (sum + (double) list.get(i));
        }
        System.out.println("=" + sum);
    }

    public static void minAndMax(ArrayList<Number> list) {
        double min = (double) list.get(0);
        double max = (double) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if ((double) list.get(i) > max) {
                max = (double) list.get(i);
            } else if ((double) list.get(i) < min) {
                min = (double) list.get(i);
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max);
    }

    public static void allMethods(ArrayList<Number> list) {
        reverse(list);
        sum(list);
        minAndMax(list);
    }

}
