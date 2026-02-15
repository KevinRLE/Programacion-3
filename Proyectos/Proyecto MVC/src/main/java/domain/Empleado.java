/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author visitante
 */
public class Empleado {             //Clase Empleado
    //Si atributos no tienen publics entonces son privados
    int id_empleado;
    String nombreEmpleado;
    String direEmpleado;

    public Empleado(int id_empleado) {  //Constructores Sobrecargados (Se llaman igual)
        this.id_empleado = id_empleado; //crea el objeto empleado, solicita el id y se le asigna
    }
    //Ejemplo: Empleado Empleado1(80);
    
    public Empleado() { //permite crear otro empleado, sin nada, es como consulta
    }
    //Ejemplo: Empleado Empleado2();
    
    //Constructor, requiere nombre del empleado y dire, solicita
    public Empleado(String nombreEmpleado, String direEmpleado) {  
        this.nombreEmpleado = nombreEmpleado;
        this.direEmpleado = direEmpleado;
    }
    //Ejemplo: Empleado Empleado3("Luis García","Conocida");

    //Metodos de objetos
    public int getId_empleado() {   //extrae datos id
        return id_empleado;
    }
    //Ejemplo: Empleado2.getid_empleado(81);

    public void setId_empleado(int id_empleado) {  //Asigna datos id
        this.id_empleado = id_empleado;
    }
    //Ejemplo: Empleado2.setid_empleado(81);
    
    public String getNombreEmpleado() { //obtiene nombre del empleado
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDireEmpleado() {
        return direEmpleado;
    }

    public void setDireEmpleado(String direEmpleado) {
        this.direEmpleado = direEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", nombreEmpleado=" + nombreEmpleado + ", direEmpleado=" + direEmpleado + '}';
    }
    

}