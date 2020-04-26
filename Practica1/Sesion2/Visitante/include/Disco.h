#include <exception>
#include <string>
using namespace std;

#ifndef __Disco_h__
#define __Disco_h__

#include "ComponenteEquipo.h"


class Disco : public ComponenteEquipo{
public:
    Disco();
    Disco(float precio,string nombre);
    void accept(VisitanteEquipo& Visitante, Cliente& C);
};
#endif
