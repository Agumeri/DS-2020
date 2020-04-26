/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriaabstracta_metodofactoria;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author agus
 */
public class FactoriaAbstracta_MetodoFactoria {
    static Cliente c = new Cliente();
    static int N;
    
    public static void crearCarreras(){
        int n=0;
        System.out.println("Introduzca el numero de participantes: ");
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        N = n;
        //Creamos primero la carrera de montaña
        FactoriaMontana fm = new FactoriaMontana();
        c.carreras.add(fm.crearCarrera(N));
        //Podriamos crear las bicicletas en el constructor Carretera pero necesitamos la factoria
        for(int i=0; i<c.carreras.get(0).getN(); i++)
            c.carreras.get(0).bicicletas.add(fm.crearBicicleta(i));
        
        c.carreras.get(0).Porcentajes();
        
        
 
        FactoriaCarretera fc = new FactoriaCarretera();
        c.carreras.add(fc.crearCarrera(N));
        //Podriamos crear las bicicletas en el constructor Carretera pero necesitamos la factoria
        for(int i=0; i<c.carreras.get(1).getN(); i++)
            c.carreras.get(1).bicicletas.add(fc.crearBicicleta(i));
        
        c.carreras.get(1).Porcentajes();
        
    }
    
    public static void simularCarrera(){
        crearCarreras();
        ((Thread)c.carreras.get(0)).start();
        ((Thread)c.carreras.get(1)).start();
        
        try{
            Thread.sleep(200);
        }catch(Exception ERROR){
            System.out.println(ERROR);
        }
    }
    
    public static void main(String[] args) {
        simularCarrera();
        System.out.println("Resultado carrera 1");
        c.carreras.get(0).mostrarRanking();
        System.out.println("Resultado carrera 2");
        c.carreras.get(1).mostrarRanking();
        
    }
    
}
