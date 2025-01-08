/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Scanner;
import static paquete3.Ejemplo031.obtenerSuma;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 
        String mensajeSuma;
        String mensajeSumaDos;
        mensajeSuma = obtenerTablaSumar(10, 9); // se invoca al método 
        // obtenerTablaSumar
        // y el valor que 
        // devuelve se lo 
        // almacena  en mensajeSuma
 
        int salida;
        int tabla;
        int limite;
        System.out.println("ingrese el limite");
        limite = entrada.nextInt();
        System.out.println("ingrese el valor de la tabla");
        tabla = entrada.nextInt();
        System.out.println("ingrese que (1)si desea sumar (2)si desea multiplicar");
        salida = entrada.nextInt();
        
        
        switch (salida) {
            case 1:
                mensajeSuma = obtenerTablaSumar(tablaOperacion);
                System.out.printf("%s\n",mensajeSuma);
            case 2 :
                mensajeSuma = obtenerTablaMultiplicar(tablaOperacion);
                System.out.printf( "%s\n",mensajeSuma);
                
                

        }


        mensajeSumaDos = obtenerTablaMultiplicar(10, 9);

        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
