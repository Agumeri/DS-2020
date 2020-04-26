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
public interface Filtro {
    double incrementoVelocidad = 0.0;
    
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor);
    
}
