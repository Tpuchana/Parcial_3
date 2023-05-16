/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_3;

/**
 *
 * @author SALA
 */
public class Auto {
    //Atributos
    private final String placa;
    private final MarcaCarro marca;
    private String color;
    private double precio;
    
    //metodos

    public Auto(String placa, MarcaCarro marca, String color, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.precio = precio*(1-this.marca.getPorcentDescuento());
    }

    public String getPlaca() {
        return placa;
    }

    public MarcaCarro getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto: " + "placa: " + placa + ", precio: " + precio + "$\n";
    }
    
    
    
    
}
