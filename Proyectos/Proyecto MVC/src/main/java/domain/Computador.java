/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author WINDOWS
 */

//Agregar atributos y metodos
public class Computador {
    
    //seleccionar, alt+insert o insrt code, se puede colocar getters y setters y metodos
    String color;
    String tamaño;
    String marca;
    String procesador;
    int ram;
    String pantalla;
    String teclado;
    
    //Contructores
    public Computador(String color, String tamaño) {
        this.color = color;
        this.tamaño = tamaño;
    }

    public Computador(String color) {
        this.color = color;
    }
    
    public Computador() {
    }

    
    
    //setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getPantalla() {
        return pantalla;
    }

    public String getTeclado() {
        return teclado;
    }
    
    
    //getters
    
    public String getColor() {
        return color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computador{" + "color=" + color + ", tama\u00f1o=" + tamaño + ", marca=" + marca + ", procesador=" + procesador + ", ram=" + ram + '}';
    }
    
}
