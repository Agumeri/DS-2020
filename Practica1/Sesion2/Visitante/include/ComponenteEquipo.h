#include <exception>
#include <string>

using namespace std;

#ifndef __ComponenteEquipo_h__
#define __ComponenteEquipo_h__

#include "Cliente.h"


class VisitanteEquipo;
class VisitantePrecio;
class VisitantePrecioDetalle;


class ComponenteEquipo{
protected:
    string nombre;
    float precio;
public:
    ComponenteEquipo();
    ComponenteEquipo(float precio, string nombre);
    float getPrecio();
    string getNombre();
    virtual void accept(VisitanteEquipo& Visitante,Cliente& C) = 0;
};

#endif
