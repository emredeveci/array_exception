import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number between 0 and " + (intArray.length - 1));
        int input = scanner.nextInt();

        System.out.println(getElementByIndex(intArray, input));
    }

    //a method that handles a possible exception
    public static String getElementByIndex(int[] array, int index) {
        try {
            return "The number at that index is: " + array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "That index number doesn't exist within this array.";
        }
    }
}