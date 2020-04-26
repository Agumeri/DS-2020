#include <exception>
using namespace std;

#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "Computador.h"

#ifndef __VisitanteEquipo_h__
#define __VisitanteEquipo_h__




class VisitanteEquipo{
public:
    virtual void visitarDisco(Disco* d,Cliente& C) = 0;
    virtual void visitarTarjeta(Tarjeta* t,Cliente& C) = 0;
    virtual void visitarBus(Bus* b,Cliente& C) = 0;
};



#endif
