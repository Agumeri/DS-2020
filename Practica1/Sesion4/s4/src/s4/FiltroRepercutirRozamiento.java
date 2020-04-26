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
public class FiltroRepercutirRozamiento implements Filtro{
    FiltroRepercutirRozamiento(){}
    
    @Override
    public double ejecutar(double Revoluciones, EstadoMotor estadoMotor){
        double revol_Final = Revoluciones;
        
        if(estadoMotor == EstadoMotor.FRENANDO && Revoluciones > 0){
            revol_Final -= revol_Final * 0.6;
        }   
        
        return revol_Final;
    }
}
