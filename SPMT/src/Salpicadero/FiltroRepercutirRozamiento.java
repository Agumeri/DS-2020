package Salpicadero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author agus
 */
public class FiltroRepercutirRozamiento implements Filtro{
    FiltroRepercutirRozamiento(){}
    
    @Override
    public double ejecutar(double Revoluciones, EstadoMotor estadoMotor){
        double revol_Final = Revoluciones;
        
        if((estadoMotor == EstadoMotor.ENCENDIDO || estadoMotor == EstadoMotor.FRENANDO) && Revoluciones > 0){
            revol_Final -= revol_Final * 0.06;
            if(Revoluciones < 1)
                   revol_Final = 0;
        }  
        
        return revol_Final;
    }
}
