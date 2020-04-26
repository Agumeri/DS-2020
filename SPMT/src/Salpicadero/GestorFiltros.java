package Salpicadero;


import Salpicadero.Salpicadero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agus
 */
public class GestorFiltros extends Thread{
    public Salpicadero s;
    public CadenaFiltros cf;
    
    public GestorFiltros(){
        s = new Salpicadero();
        cf = new CadenaFiltros();
    }
    public void peticionFiltros(EstadoMotor Estado){
        double revoluciones_aux;
        revoluciones_aux = s.getRpm();
        revoluciones_aux = cf.ejecutar(revoluciones_aux,Estado);
        s.ejecutar(revoluciones_aux,Estado);
    }
    
    
    public void run()
        {   
            // Encendemos el coche
            this.peticionFiltros(EstadoMotor.ENCENDIDO);
        }
}
