/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_3;

import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consecionario misAutos = new Consecionario("ColAutos");
        misAutos.agregarAuto("ABC123", MarcaCarro.BMW, "Rojo", 1500);
        misAutos.agregarAuto("QWE456", MarcaCarro.Audi, "Azul", 2400);
        misAutos.agregarAuto("YUI345", MarcaCarro.Ford, "Verde", 5500);
        misAutos.agregarAuto("HJK908", MarcaCarro.Lexus, "Blanco", 8500);
        misAutos.agregarAuto("TYU678", MarcaCarro.Renault, "Negro", 2500);
        
        //Interfaz gráfica
        while (true){
        String texto = """
                       Bienvenido al concesionario, qué deseas hacer hoy?
                       
                       1. Mostrar la lista de autos
                       2. Agregar auto
                       3. Buscar auto por índice
                       4. Buscar auto por placa""";
        int op = Integer.parseInt(JOptionPane.showInputDialog(texto));
        
        switch (op){
            case 1 -> JOptionPane.showMessageDialog(null, misAutos.mostrarAutos());
            case 2 -> {
                String placa = JOptionPane.showInputDialog("Ingrese la placa: ");
                MarcaCarro marca = obtenerMarca();
                String color = JOptionPane.showInputDialog("Ingrese el color: ");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio: "));
            }
            case 3 ->{
                
            }
        }
        
        
    
    public MarcaCarro obtenerMarca(){
         String texto = """
                       ¿Cuál es la marca del auto? :
                       
                       1. Mercedes-Benz
                       2. BMW
                       3. Ford
                       4. Audi
                       5. Lexus
                       6. Renault""";
         
         int op = Integer.parseInt(JOptionPane.showInputDialog(texto));
         switch (op){
             case 1 -> {
                 return MarcaCarro.Mercedez_Benz;
             }
             case 2 ->{ return MarcaCarro.BMW;
             }
             case 3 ->{
                 return MarcaCarro.Ford;
             
             }
             case 4 -> {
                 return MarcaCarro.Audi;
                 
             }
             
             case 5 -> {
                 return MarcaCarro.Lexus;
                 
             }
             case 6 -> {
                 return MarcaCarro.Renault;
             }
             default ->{
                 return null;
             }
             
         }
    }
    
         
        
        
        
        
    }
}
}





