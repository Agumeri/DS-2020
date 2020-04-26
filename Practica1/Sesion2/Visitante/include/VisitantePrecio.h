#include <exception>
using namespace std;

#ifndef __VisitantePrecio_h__
#define __VisitantePrecio_h__

#include "VisitanteEquipo.h"


class VisitantePrecio : public VisitanteEquipo{
public:
    double precio_total;
    void visitarDisco(Disco* d,Cliente& C);
    void visitarTarjeta(Tarjeta* t,Cliente& C);
    void visitarBus(Bus* b,Cliente& C);
};


#endif
