/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriaabstracta_metodofactoria;

/**
 *
 * @author agus
 */
public abstract class Bicicleta {
    private int IdBicicleta;
    
    public Bicicleta(int id){
        this.IdBicicleta = id;
    }
    
    public int getId(){
        return IdBicicleta;
    }
}
