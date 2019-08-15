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
 *
 * @author Hernan
 */

@ManagedBean
@RequestScoped
public class Datos {
    
    private long totalFinal;
    Sueldo sueldo;
    
    private String nombre;
    private long salario;
    private int dias;
    private ArrayList<String> idioma;
    
    

    public Datos() {
    }
    
    public String sueldoTotal(){
      sueldo = new Sueldo();
      long totalFinal = sueldo.calcular(getIdioma(), getDias(),getSalario(),getNombre() );
      return ""+totalFinal;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public ArrayList<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(ArrayList<String> idioma) {
        this.idioma = idioma;
    }
    
    
    
}
