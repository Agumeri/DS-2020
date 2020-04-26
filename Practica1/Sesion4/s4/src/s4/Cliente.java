/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

/**
 *
 * @author agus
 */
public class Cliente {
    public static GestorFiltros filtros;
    private static InterfazSalpicadero interfaz;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfazSalpicadero interfaz = new InterfazSalpicadero();
        interfaz.main(new String[0]);
        
    }
    
}
