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
 *@author Camilo Alvarez
 * @author Hernan Hernandez
 * @version 1.0
 * conrolador que trae  datos de otro controler y los muestra en la vista final 
 */

@ManagedBean
@RequestScoped
public class Producto {
    //trae los datos del modelo
    private Sueldo sueldo;
    //anotacion que sirve para traer datos de otro controlador 
    @ManagedProperty("#{datos}")
    private Datos datos;
    
    /**
     * constrcutor vacio
     */
    public Producto() {
    }
    /**
     * Metodo que retorna a la vista final en un string la respuesta 
     * @return 
     */
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
    
    /**
     * metodos para hacer publica las variables 
      */
    public Datos getDatos() {
        return datos;
    }
    /**
     * metodos para hacer publica las variables 
     */
    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    
    
    
    
}
