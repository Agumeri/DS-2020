package factoriaabstracta_metodofactoria;

import static factoriaabstracta_metodofactoria.FactoriaAbstracta_MetodoFactoria.c;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;


public class CarreraCarretera extends Carrera {

        public CarreraCarretera(int n_bici){
            super(n_bici);
        }
        
        public void mostrarRanking(){
        Collections.shuffle(bicicletas);
        String res = "";
        int i=0;
        while(i<this.getN()){
            res += bicicletas.get(i).getId() + ",";
            i++;
        }
        System.out.println(res);
        
        }
        public void Porcentajes(){
        int num_participantes = this.getN();
        int n1 = (int) Math.round(this.getN()*0.1);
        int j=0; 
        System.out.println("Num de participantes eliminados " + n1);
        while(j != n1){
            this.bicicletas.remove(num_participantes-1);
            num_participantes--;
            j++;
        }
        this.setN(num_participantes);
        System.out.println("En la carrera de montaña hay " + this.getN() + " participantes.");
        }
}