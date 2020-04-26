#include <exception>
using namespace std;

#ifndef __Tarjeta_h__
#define __Tarjeta_h__

#include "ComponenteEquipo.h"
#include <string>




class Tarjeta : public ComponenteEquipo{
public:
    Tarjeta();
    Tarjeta(float precio, string nombre);
    void accept(VisitanteEquipo& Visitante, Cliente& C);
};

#endif
