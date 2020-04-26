/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Computador.h
 * Author: ruben
 *
 * Created on 7 de marzo de 2020, 11:21
 */
#include <exception>
using namespace std;

#ifndef __Computador_h__
#define __Computador_h__

#include "Disco.h"
#include "Bus.h"
#include "Tarjeta.h"
#include "Cliente.h"
#include <string>

class Computador{
private:
    Bus* b;
    Disco* d;
    Tarjeta* t;
public:
    Computador(float precio_B, float precio_D, float precio_T, string nombre_B, string nombre_D, string nombre_T);
    Bus* getBus();
    Disco* getDisco();
    Tarjeta* getTarjeta();
    void aceptar(VisitanteEquipo& Visitante,Cliente& C);
    void mostrar();
 
};


#endif 

