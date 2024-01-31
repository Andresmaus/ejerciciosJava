import java.util.Scanner;

/**
 *
 * @author Andrés Sánchez
 */
public class NumeroFeliz {

    public static boolean NFeliz(int n) {
        int dato1 = n;
        int dato2 = n;

        do {
            dato1 = sumaCuadradosDigitos(dato1);
            dato2 = sumaCuadradosDigitos(sumaCuadradosDigitos(dato2));

            if (dato1 == 1) {
                return true;
            }
        } while (dato1 != dato2);

        return false;
    }

    public static int sumaCuadradosDigitos(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma += digito * digito;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        String salida = "";
        do {
            System.out.print("Digita un numero: ");
            numero = teclado.nextInt();

            if (NFeliz(numero)) {
                System.out.println(numero + " es un número feliz.");
            } else {
                System.out.println(numero + " no es un número feliz.");
            }

            System.out.println("\nQuieres continuar? escribi si");
            salida = teclado.next();
        } while(salida.equals("si"));
    }

}