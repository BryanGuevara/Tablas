package multiplicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplicacion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = 0;

        try {

            System.out.println("=================================================== <[Entrada]> ==================================================");
            System.out.print("Ingrese el numero para generar la tabla: ");
            int num = scan.nextInt();

            System.out.print("Ingrese hasta que numero quiere la tabla: ");
            int mul = scan.nextInt();
            
            System.out.println("=================================================== <[Tabla]> ===================================================");
            
            for (int i = 1; i <= mul; i++) {
                res = res + num;
                System.out.println(num + " X " + i + " = " + res);
            }

            System.out.println("==================================================================================================================");
            
        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }

    }

}
