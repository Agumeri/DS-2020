#include <exception>
using namespace std;

#ifndef __Bus_h__
#define __Bus_h__

#include <string>

#include "ComponenteEquipo.h"



class Bus : public ComponenteEquipo{
public:
    Bus();
    Bus(float precio, string nombre);
    void accept(VisitanteEquipo& Visitante, Cliente& C);
};

#endif
