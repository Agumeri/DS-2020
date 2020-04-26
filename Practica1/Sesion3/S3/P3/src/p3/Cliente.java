/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author agus
 */
public class Cliente {
    public static void main(String[] args) throws InterruptedException{
        Simulador s = new Simulador();
        graficaTemperatura grafica = new graficaTemperatura();
        pantallaTemperatura pantalla = new pantallaTemperatura(s);
        botonCambio boton = new botonCambio(s);
        
        s.addObserver(grafica);
        s.addObserver(boton);
        
        Thread hebra = new Thread(s);
        hebra.start();
        
        boton.main(new String[0]);
        grafica.main(new String[0]);
        pantalla.main(new String[0]);
    }
}
