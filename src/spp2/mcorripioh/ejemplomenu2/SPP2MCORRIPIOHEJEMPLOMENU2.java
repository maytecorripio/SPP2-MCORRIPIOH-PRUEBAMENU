/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.ejemplomenu2;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SPP2MCORRIPIOHEJEMPLOMENU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables.
        int opEntrada;
        double lado, resultado;
        Scanner kb = new Scanner (System.in);
        
        //Desplegamos menú
        System.out.println("Calculadora de áreas, perímetros y volúmenes");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular áreas");
        System.out.println("2. Calcular perímetros");
        System.out.println("3. Calcular volúmenes");
        System.out.println("4. Salir.");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de áreas");
                lado= pedirLado();
                resultado = Math.pow(lado,2);
                System.out.println("El área del cuadrado es "+ resultado);
                break;
            case 2:
                System.out.println("Bienvenido al cálculo de perímetros");
                lado= pedirLado();
                resultado = lado * 4;
                System.out.println("El perímetro del cuadrado es "+ resultado);
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de volúmenes");
                resultado = Math.pow(pedirLado(),3);
                mostrarResultado(resultado,"volumen");
                break;
            default:
                System.out.println("Adiós!");   
        }
        
}
static double pedirLado(){
    double lado;
    Scanner kb = new Scanner (System.in);
    System.out.println("Introduce el lado del cuadrado");
    lado= kb.nextDouble();
    return lado;
}

static void mostrarResultado(double resultado, String dato){
    System.out.println("El" + dato + "es" + r);
}
}        
