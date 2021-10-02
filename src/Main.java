import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = scan.next();

        System.out.println("Podaj nazwisko: ");
        String surname = scan.next();

        System.out.println("Podaj wiek: ");
        int age = scan.nextInt();

        System.out.println("Podaj nr indeksu: ");
        int indexNumber = scan.nextInt();

        System.out.printf("Imię: %s\n", name);
        System.out.println("Nazwisko: " + surname);
        System.out.printf("Wiek: %s\n", age);
        System.out.println("Nr indeksu: " + indexNumber);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int a = 10;
        int b = 3;

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);
        System.out.println("a % b = " + mod);
    }
}
