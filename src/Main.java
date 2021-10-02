import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        boolean a = true;
        boolean b = false;
        int x = 10;
        int y = 20;

        System.out.printf("((a && !b) || (x > y)) && (x * y > y): %s\n", ((a && !b) || (x > y)) && (x * y > y));
        System.out.printf("((!a && b) || (x >= y)) && (a || !b): %s\n", ((!a && b) || (x >= y)) && (a || !b));
        System.out.printf("(x < y) && ((x >= y) || (x + y <= x)): %s\n", (x < y) && ((x >= y) || (x + y <= x)));
    }
}
