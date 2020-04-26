package factoriaabstracta_metodofactoria;

import java.lang.Math;
import java.util.ArrayList;

public class FactoriaCarretera extends FactoriaCarrera_Bicicleta {
    
        @Override
	public CarreraCarretera crearCarrera(int i) {
            return new CarreraCarretera(i);
	}

        @Override
	public BicicletaCarretera crearBicicleta(int id) {
            return new BicicletaCarretera(id);
	}
}