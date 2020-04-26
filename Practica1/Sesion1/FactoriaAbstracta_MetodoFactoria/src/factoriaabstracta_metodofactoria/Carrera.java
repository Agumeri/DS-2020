package factoriaabstracta_metodofactoria;
import java.util.ArrayList;

public abstract class Carrera extends Thread{
	private int N; //num_bicicletas
        public ArrayList<Bicicleta> bicicletas = new ArrayList();
        
        public Carrera(int n_bicis){
            this.N = n_bicis;
        }
        
        public abstract void  mostrarRanking();
        
        public void setN(int n){
            this.N = n;
        }
        
        public int getN(){
            return N;
        }
        
        public abstract void Porcentajes();
}