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
public class Salpicadero {
    static final double radio = 0.15;
    
    private double rpm = 0;
    private double velocidadLineal;
    private double velocidadAngular;
    private double distanciaRecorrida;
    private double contador_reciente;
    private double contador_total;
    long tiempo_anterior = 0;
    long tiempo_actual = 0;
    
    
    Salpicadero(){
        this.contador_reciente = 0.0;
        this.contador_total = 0.0;
    }
    
    public void ejecutar(double revoluciones, EstadoMotor estadoMotor){
        if(estadoMotor == EstadoMotor.ACELERANDO || estadoMotor == EstadoMotor.FRENANDO){
            
            this.tiempo_anterior = this.tiempo_actual;
            this.tiempo_actual = System.currentTimeMillis();
            
            this.rpm = revoluciones;
            
            this.velocidadLineal = 2*Math.PI*radio*rpm*(60.0/1000.0);

            this.velocidadAngular = rpm*Math.PI/30;
            
             
            this.distanciaRecorrida = velocidadLineal*((tiempo_actual-tiempo_anterior))/1000; 
            if(this.velocidadLineal > 0){
                contador_total += 0.5;
                contador_reciente += 0.5;
            }
        }
        else if(estadoMotor == EstadoMotor.ENCENDIDO){
            
            
            this.tiempo_anterior = this.tiempo_actual;
            this.tiempo_actual = System.currentTimeMillis();
            
            this.rpm = revoluciones;
            
            this.velocidadLineal = 2*Math.PI*radio*rpm*(60.0/1000.0);
            //Velocidad angular que no tengo ni zorra de como hacerla
            this.velocidadAngular = rpm*Math.PI/30; //????????
            
             
            this.distanciaRecorrida = velocidadLineal*((tiempo_actual-tiempo_anterior))/1000; 
            if(this.velocidadLineal > 0){
                contador_total += 0.5;
                contador_reciente += 0.5;
            }
            
        }
        else if(estadoMotor == EstadoMotor.APAGADO){
            this.tiempo_actual = System.currentTimeMillis();
            contador_reciente=0;

        }
        
        //Hay que poner algo que calcule el tiempo que transcurre para calcular distanciaRecorrida 
        //Ponemos caso de que se mantenga el vehiculo a cierta velocidad? Pa aumentar cuentaKilometors y eso
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
    

    public double getRpm() {
        return rpm;
    }

    public double getVelocidadLineal() {
        return velocidadLineal;
    }

    public double getVelocidadAngular() {
        return velocidadAngular;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public double getContador_reciente() {
        return contador_reciente;
    }

    public double getContador_total() {
        return contador_total;
    }
    
    
    
}
