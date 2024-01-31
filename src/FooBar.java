import java.util.Scanner;

/**
 *
 * @author Andrés Sánchez
 */
public class FooBar {

    public static void main(String[] args) {

        int N;
        Scanner teclado = new Scanner(System.in);

        while(true) {
            System.out.print("Entrada: ");
            N = teclado.nextInt();

            System.out.print("Salida: ");

            if (N % 3 == 0 && N % 5 == 0) {
                System.out.print("FooBar");
            } else if (N % 3 == 0) {
                System.out.print("Foo");
            } else if (N % 5 == 0) {
                System.out.print("Bar");
            } else {
                System.out.print(N);
            }
            System.out.println("");
        }

    }

}