#include <exception>
using namespace std;

#include "VisitantePrecio.h"


void VisitantePrecio::visitarDisco(Disco* D,Cliente& C) {
    precio_total += D->getPrecio()*C.getDescuento();
}

void VisitantePrecio::visitarTarjeta(Tarjeta* T,Cliente& C) {
    precio_total += T->getPrecio()*C.getDescuento();
}

void VisitantePrecio::visitarBus(Bus* B,Cliente& C) {
    precio_total += B->getPrecio()*C.getDescuento();
}

