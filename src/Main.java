import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte valueByte = 1;
        System.out.println("Value byte = " + valueByte);
        short valueShort = 2;
        System.out.println("Value short = " + valueShort);
        int valueInt = 3;
        System.out.println("Value int = " + valueInt);
        long valueLong = 4;
        System.out.println("Value long = " + valueLong);
        float valueFloat = 5.0f;
        System.out.println("Value float = " + valueFloat);
        double valueDouble = 6.0;
        System.out.println("Value double = " + valueDouble);
        boolean valueBoolean = true;
        System.out.println("Value boolean = " + valueBoolean);
        char valueChar = 'x';
        System.out.println("Value char = " + valueChar);
        String valueString = "some string";
        System.out.println("Value string = " + valueString);

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        int a = 7;
        int b = 9;
        double x = 13.0;
        double y = 18.0;

        int sumInt = a + b;
        int diffInt = a - b;
        int mulInt = a * b;
        int divInt = a / b;
        int modInt = a % b;

        System.out.println("a + b = " + sumInt);
        System.out.println("a - b = " + diffInt);
        System.out.println("a * b = " + mulInt);
        System.out.println("a / b = " + divInt);
        System.out.println("a % b = " + modInt);

        double sumDouble = x + y;
        double diffDouble = x - y;
        double mulDouble = x * y;
        double divDouble = x / y;
        double modDouble = x % y;

        System.out.println("x + y = " + sumDouble);
        System.out.println("x - y = " + diffDouble);
        System.out.println("x * y = " + mulDouble);
        System.out.println("x / y = " + divDouble);
        System.out.println("x % y = " + modDouble);
    }
}
