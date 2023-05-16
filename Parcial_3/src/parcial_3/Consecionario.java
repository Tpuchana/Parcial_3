
package parcial_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class Consecionario {
    
    private String nombre;
    private ArrayList<Auto> listaAutos;   
    private static int cantidadAutos;
    
    //Metodos

    public Consecionario(String nombre) {
        this.nombre = nombre;
        //creación de la lista siempre en el método constructor
        this.listaAutos = new ArrayList<>();
        
    
    
    }
    
    public void agregarAuto(Auto carroNuevo){
        this.listaAutos.add(carroNuevo);
        JOptionPane.showMessageDialog(null, "Se agregó el auto con éxito");
    }
    public void agregarAuto(String placa, MarcaCarro marca, String color, double precio){
        Auto carroNuevo = new Auto(placa, marca, color, precio);
        this.agregarAuto(carroNuevo);
        
//      JOptionPane.showMessageDialog(null, "Se agregó el auto con éxito");
    }
    
    public String mostrarAutos(){
        String texto = "lista de autos del concesaionario" + this.nombre + "\n";
        //For each
        for(Auto i : this.listaAutos){
            texto += i.toString();
        }
        
        return texto;
    }
    
    
    
    
}
