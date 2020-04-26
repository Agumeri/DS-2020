/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Cliente.cpp
 * Author: ruben
 * 
 * Created on 7 de marzo de 2020, 15:19
 */

#include "Cliente.h"

Cliente::Cliente() {
    this->descuento = 1;
}

float Cliente::getDescuento(){
    return this->descuento;
}

