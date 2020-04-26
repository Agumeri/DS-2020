#include <exception>
using namespace std;

#include "Bus.h"
#include "VisitanteEquipo.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"


Bus::Bus(){
    this->nombre = "Unknown";
    this->precio = 0.0; 
}
Bus::Bus(float precio, string nombre){
    this->nombre = nombre;
    this->precio = precio;
}


void Bus::accept(VisitanteEquipo& Visitante,Cliente& C){
    Visitante.visitarBus(this,C);
}

