import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("The application reverses the element of the array");

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a size: ");
            size = scanner.nextInt();

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // array reverse
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println();
        System.out.println("Array new: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
