#include <exception>
using namespace std;
#include <vector>

#include "ComponenteEquipo.h"

ComponenteEquipo::ComponenteEquipo(){}

ComponenteEquipo::ComponenteEquipo(float precio, string nombre)
{
    this->precio = precio;
    this->nombre = nombre;
}

string ComponenteEquipo::getNombre(){
    return this->nombre;
}
float ComponenteEquipo::getPrecio(){
    return this->precio;
}