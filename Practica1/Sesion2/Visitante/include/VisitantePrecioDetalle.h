#include <exception>
using namespace std;

#ifndef __VisitantePrecioDetalle_h__
#define __VisitantePrecioDetalle_h__


#include "VisitanteEquipo.h"
#include <string>

class VisitantePrecioDetalle : public VisitanteEquipo{
public:
    string info;
    void visitarDisco(Disco* d,Cliente& C);
    void visitarTarjeta(Tarjeta* t,Cliente& C);
    void visitarBus(Bus* b,Cliente& C);
};

#endif
