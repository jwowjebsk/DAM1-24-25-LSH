package ud2.ejercicioscondicionales;

import java.util.Scanner;
/*
 * E0204. Implementar un programa que pida por teclado un número decimal e indique si es un
número casi-cero que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1
unidad, aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de números
casi-cero son el 0,3, el -0,99 o el 0,123; algunos números que no se consideran casi-ceros son: el
12,3, el 0 o el -1.
 */
public class E0204 {
    public static void main(String[] args) {
        double numero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        numero = sc.nextDouble();
        sc.close();

        if (numero < 1.0 && numero > -1.0) {
            System.out.printf("El número %.2f se considera un número casi-cero.\n", numero);
        } else {
            System.out.printf("EL número %.2f NO se considera casi-cero.\n", numero);
        }
    }  
}
