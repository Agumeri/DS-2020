/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
using namespace std;
#include <iostream>

#include "Computador.h"

Computador::Computador(float precio_B, float precio_D, float precio_T, string nombre_B, string nombre_D, string nombre_T){
    b = new Bus(precio_B,nombre_B);
    d = new Disco(precio_D,nombre_D);
    t = new Tarjeta(precio_T,nombre_T);
}

Bus* Computador::getBus(){
    return this->b;
}

Disco* Computador::getDisco(){
    return this->d;
}

Tarjeta* Computador::getTarjeta(){
    return this->t;
}


void Computador::aceptar(VisitanteEquipo& Visitante,Cliente& C){
    b->accept(Visitante,C);
    d->accept(Visitante,C);
    t->accept(Visitante,C);
}

void Computador::mostrar(){
    cout<<"El bus tiene un coste de :"<<b->getPrecio()<<" €"<<endl;
    cout<<"El disco tiene un coste de :"<<d->getPrecio()<<" €"<<endl;
    cout<<"La tarjeta tiene un coste de :"<<t->getPrecio()<<" €"<<endl;
}
