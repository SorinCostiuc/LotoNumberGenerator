import java.util.ArrayList;
import java.util.Random;

public class LotoGenerator {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------");
        System.out.println("Numerele la 6/49 sunt: ");
        ArrayList list = winners(6, 1, 49);
        for (Object value : list) {
            System.out.print(" " + value);

        }
        System.out.println();
        System.out.println("---------------");
        System.out.println("Numerele la JOKER sunt: ");
        ArrayList list1 = winners(5, 1, 45);
        for (Object o : list1) {
            System.out.print(" " + o);

        }
        System.out.println();
        System.out.println("---------------");
        System.out.println("JOKER-ul este: ");
        ArrayList list2 = winners(1, 1, 20);
        for (Object o : list2) {
            System.out.print(" " + o);
            System.out.println();
            System.out.println("---------------");

        }
    }

    private static ArrayList winners(int size, int min, int max) {
        ArrayList numbers = new ArrayList();
        Random random = new Random();
        while (numbers.size() < size) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;

    }
    //        int numbers = 0;
//        Random rand = new Random();
//        System.out.println("Numerele sunt: ");
//        for (int i = 0; i < 6; i++) {
//            numbers = rand.nextInt(49) + 1;
//            System.out.print(numbers + " ");
//        }
}
