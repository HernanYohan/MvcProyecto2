/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Sueldo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hernan
 */

@ManagedBean
@RequestScoped
public class Producto {
    private Sueldo sueldo;
    
    @ManagedProperty("#{datos}")
    private Datos datos;
    
    public Producto() {
    }

    public String respuesta(){
    sueldo=new Sueldo();
    long total = sueldo.calcular(datos.getIdioma(), datos.getDias(),datos.getSalario(),datos.getNombre());
    String mostrar = "apreciado  " + datos.getNombre()+
            "  recuerde que el valor del dia laboral es de  " +datos.getSalario()+
            "  pesos, sus dias laborados son  "+ datos.getDias()+
            "  esto, sumado a los idiomas que habla que son  "+datos.getIdioma().size()+
            "  completan un total de:  "+total;
    return mostrar;
    }
    
    
    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    
    
    
    
}
