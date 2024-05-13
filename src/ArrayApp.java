import java.util.Scanner;

public class ArrayApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = createAndFillArray();
        System.out.println("Mostrando el arreglo:");
        displayArray(array);
        System.out.println("Mostrando el arreglo invertido:");
        displayArrayInReverse(array);
    }

    public static int[] createAndFillArray() {
        int size = getArraySizeFromUser();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = getElementFromUser(i);
        }
        return array;
    }

    public static int getArraySizeFromUser() {
        int size;
        do {
            System.out.println("Ingrese el tamaño del arreglo (de 1 a 16):");
            size = scanner.nextInt();
        } while (size < 1 || size > 16);
        return size;
    }

    public static int getElementFromUser(int index) {
        System.out.println("Ingrese el valor [" + index + "]:");
        return scanner.nextInt();
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void displayArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
