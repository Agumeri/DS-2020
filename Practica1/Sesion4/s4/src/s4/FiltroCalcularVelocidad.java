/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

/**
 *
 * @author agus
 */
public class FiltroCalcularVelocidad implements Filtro{
    FiltroCalcularVelocidad(){}
    
    @Override
    public double ejecutar(double Revoluciones, EstadoMotor estadoMotor){
        double revol_Final = Revoluciones;
        
        if(estadoMotor == EstadoMotor.ACELERANDO && Revoluciones<5000){
            revol_Final = 100.0 + revol_Final;
            //System.out.print(revol_Final);
        }
        else if(estadoMotor == EstadoMotor.FRENANDO && Revoluciones > 0){
            revol_Final -= 100;
        }
        
        if(revol_Final <= 0){
            revol_Final = 0;
        }
        return revol_Final;
    } 
}
