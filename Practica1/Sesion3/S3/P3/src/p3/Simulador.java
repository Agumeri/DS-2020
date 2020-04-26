/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
/**
 *
 * @author agus
 */
public class Simulador extends Observable implements Runnable {
    private double tempC;
    private double tempF;
    
    public double getTempC(){
        return this.tempC;
    }
    
    public double getTempF(){
        return this.tempF;
    }
    
    public void setTempC(double tC){
        this.tempC = tC;
        setChanged();
        notifyObservers(tC);
    }
    
    public void setTempF(double tF){
        this.tempF = tF;
        setChanged();
        notifyObservers(tF);
    }
    
    @Override
    public void run(){
        double min = -20,
               max =  50;
        
        Random rand = new Random();
        
        this.tempC = min+rand.nextDouble() * (max-min);
        this.tempF = (tempC*1.8) + 32;
        
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        
        
        
    }
}
