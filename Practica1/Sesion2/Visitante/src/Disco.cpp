#include <exception>
using namespace std;

#include "Disco.h"
#include "VisitanteEquipo.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"



Disco::Disco(){
    this->nombre = "Unknown";
    this->precio = 0.0;
}
Disco::Disco(float precio, string nombre){
    this->nombre = nombre;
    this->precio = precio;
}


void Disco::accept(VisitanteEquipo& Visitante,Cliente& C) {
	Visitante.visitarDisco(this,C);
}

