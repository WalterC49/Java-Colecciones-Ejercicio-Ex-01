/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Servicio {
    private Scanner leer;
    private ArrayList<Integer> Numeros;
    
    public Servicio(){
        this.leer = new Scanner(System.in);
        this.Numeros = new ArrayList();
    }
    
    public void IngresarNumeros(){
        int numero;
        do{
            System.out.print("Ingrese un Nº(-99 para dejar de ingresar): ");
            numero=leer.nextInt();
            if(numero!=-99){
                Numeros.add(numero);
            }
        }while(numero!=-99);
    }
    
    public void CantidadDeNumeros(){
        System.out.println((Numeros.size()==1)?"Se ha leido 1 valor.":"Se han leido "+Numeros.size()+" valores.");
    }
    
    public int SumaNumeros(){
        int suma=0;
        for(Integer i:Numeros){
            suma+=i;
        }
        return suma;
    }
    
    public void PromedioNumeros(){
        double promedio=SumaNumeros()/Numeros.size();
        System.out.println("El promedio de los valores ingresados es: "+String.format("%.2f", promedio));
    }
    
}
