import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wiek: ");
        int age = scan.nextInt();

        if (age % 3 == 0) {
            System.out.println("Wiek jest podzielny przez 3.");
        } else {
            System.out.println("Wiek nie jest podzielny przez 3.");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println("Podaj nr indeksu: ");
        int indexNumber = scan.nextInt();

        String result = (indexNumber % 2 == 0) ? "parzysty" : "nieparzysty";
        System.out.println("Numer indeksu jest " + result);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("Podaj liczbę zmiennoprzecinkową x: ");
        double x = scan.nextDouble();

        if (x < 0) {
            System.out.println("x < 0");
        } else if (x < 10) {
            System.out.println("x < 10");
        } else if ( x < 20) {
            System.out.println("x < 20");
        } else {
            System.out.println("x >= 20");
        }
    }
}
