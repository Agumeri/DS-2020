#include <exception>
#include <string>
using namespace std;

#include "VisitantePrecioDetalle.h"

void VisitantePrecioDetalle::visitarDisco(Disco* D,Cliente& C) {
    info += "Componente: "; info += D->getNombre();  info+= ". Precio: "; info +=  to_string(D->getPrecio()*C.getDescuento());  info +=" €.\n"; 
}

void VisitantePrecioDetalle::visitarTarjeta(Tarjeta* T,Cliente& C) {
    info += "Componente: "; info += T->getNombre();  info+= ". Precio: "; info +=  to_string(T->getPrecio()*C.getDescuento());  info +=" €.\n"; 
}

void VisitantePrecioDetalle::visitarBus(Bus* B,Cliente& C) {
    info += "Componente: "; info += B->getNombre();  info+= ". Precio: "; info +=  to_string(B->getPrecio()*C.getDescuento());  info +=" €.\n"; 
}

