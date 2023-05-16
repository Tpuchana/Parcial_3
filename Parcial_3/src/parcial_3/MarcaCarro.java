/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package parcial_3;

/**
 *
 * @author SALA
 */
public enum MarcaCarro {
    BMW(0.15), Mercedez_Benz(0.05), Audi(0.08), Lexus(0.10), Renault(0.20), Ford(0);
    
    private final double porcentDescuento;

    private MarcaCarro(double porcentDescuento) {
        this.porcentDescuento = porcentDescuento;
    }

    public double getPorcentDescuento() {
        return porcentDescuento;
    }
    
    
}
