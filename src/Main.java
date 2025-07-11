// FIXED: Importar Scanner para entrada de datos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // FIXED: Crear Scanner con System.in
        Scanner s = new Scanner(System.in);

        // FIXED: Corregir comillas
        System.out.print("Introduzca un número: ");

        // FIXED: Leer número como entero
        int ni = s.nextInt();

        // FIXED: Guardar copia del valor original para mostrarlo al final
        int c = ni;

        int afo = 0;
        int noAfo = 0;

        while (ni > 0) {
            // FIXED: Obtener último dígito
            int digito = ni % 10;

            // FIXED: Contar dígitos afortunados
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }

            // FIXED: Eliminar el último dígito
            ni /= 10;
        }

        // FIXED: Mostrar mensaje correcto según el conteo
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }

        // FIXED: Cerrar el Scanner
        s.close();
    }
}
