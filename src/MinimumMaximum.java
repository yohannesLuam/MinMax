import java.util.Random;

public class MinimumMaximum {
    public static void main(String[] args) {

        int collectionSize = 10, i = 1;
        int num, min = 101, max = 0;

        System.out.println("This program draws ten integers from 1 to 100 and finds the smallest and greatest value");

        Random r = new Random();
        System.out.print("Drawn numbers: ");

        while (i <= collectionSize) {
            num = Math.round((r.nextInt(100)+1));
            System.out.print(num + " ");

            if (num<min) min = num;
            if (num>max) max = num;

            i++;
        }
        System.out.println("");
        System.out.println("The largest number in the collection is: " + max);
        System.out.println("The smallest number in the collection is: " + min);
    }
}
