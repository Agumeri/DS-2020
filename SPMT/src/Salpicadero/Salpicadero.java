package Salpicadero;


import eu.hansolo.steelseries.gauges.Radial1Lcd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    private double gasolina;
    private boolean aceite = false;
    private boolean frenos = false;
    private boolean revision = false;
    private double rev_totales;
    long tiempo_anterior = 0;
    long tiempo_actual = 0;
    
    
    Salpicadero(){
        this.contador_reciente = 0.0;
        this.contador_total = 0.0;
        this.gasolina = 100.0;
    }
    
    public void ejecutar(double revoluciones, EstadoMotor estadoMotor){
        if(estadoMotor == EstadoMotor.ACELERANDO || estadoMotor == EstadoMotor.FRENANDO){
            
            this.tiempo_anterior = this.tiempo_actual;
            this.tiempo_actual = System.currentTimeMillis();
            
            this.rpm = revoluciones;
            this.rev_totales += this.rpm;
            
            this.velocidadLineal = 2*Math.PI*radio*rpm*(60.0/1000.0);

            this.velocidadAngular = rpm*Math.PI/30;
            
             
            this.distanciaRecorrida = velocidadLineal*((tiempo_actual-tiempo_anterior))/1000; 
            if(this.velocidadLineal > 0){
                contador_total += 0.1;
                contador_reciente += 0.1;
            }
            if( rev_totales >= (rpm*rpm)*5/100000  && (estadoMotor == EstadoMotor.ACELERANDO)){
                this.gasolina -= 1;
                rev_totales = 0.0;
            }
            if(rev_totales > 5*1000000){
                this.aceite = true;
            }
            if(rev_totales > 100000000){
                this.frenos = true;
            }
            if(rev_totales > 1000000000){
                this.revision = true;
            }
            
        }
        else if(estadoMotor == EstadoMotor.ENCENDIDO){
            
            
            this.tiempo_anterior = this.tiempo_actual;
            this.tiempo_actual = System.currentTimeMillis();
            
            this.rpm = revoluciones;
            this.rev_totales += this.rpm;
            
            this.velocidadLineal = 2*Math.PI*radio*rpm*(60.0/1000.0);
            //Velocidad angular que no tengo ni zorra de como hacerla
            this.velocidadAngular = rpm*Math.PI/30; //????????
            
             
            this.distanciaRecorrida = velocidadLineal*((tiempo_actual-tiempo_anterior))/1000; 
            if(this.velocidadLineal > 0){
                contador_total += 0.1;
                contador_reciente += 0.1;
            }
            if(rev_totales > 5*1000000){
                this.aceite = true;
            }
            if(rev_totales > 100000000){
                this.frenos = true;
            }
            if(rev_totales > 1000000000){
                this.revision = true;
            }
            
            
        }
        else if(estadoMotor == EstadoMotor.ANDANDO){
            this.tiempo_actual = System.currentTimeMillis();
            contador_reciente += 0.1;
            contador_total += 0.1;
            if( rev_totales >= (rpm*rpm)*5/100000 ){
                this.gasolina -= 1;
                rev_totales =0.0;
            }
            if(rev_totales > 5*1000000){
                this.aceite = true;
            }
            if(rev_totales > 100000000){
                this.frenos = true;
            }
            if(rev_totales > 1000000000){
                this.revision = true;
            }
        }
        else if(estadoMotor == EstadoMotor.APAGADO){
            contador_reciente = 0;
        }
            
    }
    public void setVelocidadLineal(double velocidad){
        this.velocidadLineal = velocidad;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
    
    public void setGasolina(double gasolina){
        this.gasolina = gasolina;
    }
    
    public void setAceite(boolean variable){
        this.aceite = variable;
    }
    public boolean getFrenos() {
        return frenos;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }

    public boolean getRevision() {
        return revision;
    }

    public void setRevision(boolean revision) {
        this.revision = revision;
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
    
    public double getGasolina(){
        return gasolina;
    }
    
    public boolean getAceite(){
        return aceite;
    }
    
 
    
}
