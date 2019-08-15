/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Sueldo;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *@author Camilo Alvarez
 * @author Hernan Hernandez
 * @version 1.0
 * Controlador del index 
 */

@ManagedBean
@RequestScoped
public class Datos {
   //Variable que reorna un long con todos los datos   
    private long totalFinal;
    Sueldo sueldo;
    //variable que guarda el nonbre del usuario 
    private String nombre;
    //variable que guarda el salario del usuario 
    private long salario;
     //variable que guarda los dias trabajados  del usuario
    private int dias;
     //lista que guarda los idiomas que habla  el usuario
    private ArrayList<String> idioma;
    
    
/**
 * Constrcutor vacio 
 */
    public Datos() {
    }
    
    /**
     * metodo que retorna los datos
     * @return totalFinal
     */
    public long sueldoTotal(){
      sueldo = new Sueldo();
      long totalFinal = sueldo.calcular(getIdioma(), getDias(),getSalario(),getNombre() );
      return totalFinal;
     
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
     */
    public long getSalario() {
        return salario;
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
     */
    public void setSalario(long salario) {
        this.salario = salario;
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
     */
    public int getDias() {
        return dias;
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
     */
    public void setDias(int dias) {
        this.dias = dias;
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
      */
    public ArrayList<String> getIdioma() {
        return idioma;
    }
    /**
     * Metodo que vuelve publica la variable con seguridad
      */
    public void setIdioma(ArrayList<String> idioma) {
        this.idioma = idioma;
    }

}
