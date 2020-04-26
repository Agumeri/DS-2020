#include <iostream>
#include <cstdlib>

#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"
#include "Disco.h"
#include "Bus.h"
#include "Tarjeta.h"
#include "Computador.h"
#include "Estudiante.h"
#include "Mayorista.h"




using namespace std;

int main(int argc, char** argv) {
    Cliente cli = Cliente();
    Estudiante est = Estudiante();
    Mayorista mayo = Mayorista();
    
    
    
    Computador* comp1 = new Computador(5,10,15,"Disco", "Tarjeta", "Bus");
    Computador* comp2 = new Computador(15,20,20,"Disco", "Tarjeta", "Bus");

    VisitantePrecio vp = VisitantePrecio();
    VisitantePrecioDetalle vpd = VisitantePrecioDetalle();
    
    comp1->aceptar(vp,mayo);
    comp2->aceptar(vpd,mayo);
    
    cout<<"El precio total del computador pc1 para mayorista es: "<<vp.precio_total<<endl;
    cout<<"El computador pc1 está formado para mayorista por: "<<endl;
    cout<<vpd.info<<endl;
    
    comp1->aceptar(vp,cli);
    comp2->aceptar(vpd,cli);
    
    cout<<"El precio total del computador pc1 para cliente es: "<<vp.precio_total<<endl;
    cout<<"El computador pc1 está formado para cliente por: "<<endl;
    cout<<vpd.info<<endl;
    
    
    comp1->aceptar(vp,est);
    comp2->aceptar(vpd,est);
    
    cout<<"El precio total del computador pc1 para estudiante es: "<<vp.precio_total<<endl;
    cout<<"El computador pc1 está formado para estudiante por: "<<endl;
    cout<<vpd.info<<endl;
    
    cout << "Hola mundo " << endl;
    return 0;
}

