package Salpicadero;


import Salpicadero.EstadoMotor;
import Salpicadero.Filtro;
import Salpicadero.FiltroCalcularVelocidad;
import Salpicadero.FiltroRepercutirRozamiento;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

import java.util.ArrayList;
/**
 *
 * @author agus
 */

public class CadenaFiltros {
    public ArrayList<Filtro> lista_filtros = new ArrayList<>();
    
    CadenaFiltros(){
        lista_filtros.clear();
        this.lista_filtros.add(new FiltroCalcularVelocidad());
        this.lista_filtros.add(new FiltroRepercutirRozamiento());
    }
    
    
    
    public double ejecutar(double Revoluciones, EstadoMotor estadoMotor){
        
        
        Revoluciones = this.lista_filtros.get(0).ejecutar(Revoluciones, estadoMotor);
        Revoluciones = this.lista_filtros.get(1).ejecutar(Revoluciones, estadoMotor);
        
        
        return Revoluciones;
    }
}
