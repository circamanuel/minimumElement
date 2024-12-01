import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println(Arrays.toString(findMin(readIntegers())));
        System.out.println("-".repeat(20));

    }

// Scanner takes String from console and converts it to an int array.
    public static int[] readIntegers(String... integers) {

        Scanner sc = new Scanner(System.in);
        System.out.println("choose some numbers and separate them whit (,) --> 4, 5, 6");
        String line = sc.nextLine();
        String[] numberStr = line.split(",");


        int[] numbers = new int[numberStr.length];
// iterates through the String array and inserts the index value to the (int) numbers array.
        for (int i = 0; i < numberStr.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numberStr[i].trim());
            }
            catch (NumberFormatException nfe) {
                numbers[i] = 0;
            }

        }
        return numbers;
    }

    public static int[] findMin(int[] array) {

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }

        }
        System.out.println("-".repeat(20));
        System.out.print("Sorted List: ");
        return array;
    }

}




