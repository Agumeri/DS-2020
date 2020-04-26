package factoriaabstracta_metodofactoria;
import java.util.ArrayList;

public class FactoriaMontana extends FactoriaCarrera_Bicicleta {
        
        @Override
	public CarreraMontana crearCarrera(int i) {
            return new CarreraMontana(i);
            
	}
        
        @Override
	public BicicletaMontana crearBicicleta(int id) {
            return new BicicletaMontana(id);
	}
}