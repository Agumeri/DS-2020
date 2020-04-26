#include <exception>
using namespace std;

#include "Tarjeta.h"
#include "VisitanteEquipo.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"




Tarjeta::Tarjeta(){
    this->nombre = "Unknown";
    this->precio = 0.0;
}
Tarjeta::Tarjeta(float precio, string nombre){
    this->nombre = nombre;
    this->precio = precio;
}

void Tarjeta::accept(VisitanteEquipo& Visitante,Cliente& C) {
    Visitante.visitarTarjeta(this,C);
}







