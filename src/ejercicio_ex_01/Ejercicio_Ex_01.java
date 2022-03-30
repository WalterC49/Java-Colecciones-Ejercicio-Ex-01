/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
*/
package ejercicio_ex_01;

import Servicios.Servicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa guarda Nº enteros en una lista y luego muestra la cant. de Nº ingresados y su promedio.");
        Servicio Serv = new Servicio();
        Serv.IngresarNumeros();
        Serv.CantidadDeNumeros();
        System.out.println("La suma de los valores es: "+Serv.SumaNumeros());
        Serv.PromedioNumeros();
    }
    
}
