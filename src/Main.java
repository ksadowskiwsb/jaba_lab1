import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Podaj %s liczbę: ", i + 1);
            arr[i] = scan.nextDouble();
        }

        System.out.print("arr = [");

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
    }
}
