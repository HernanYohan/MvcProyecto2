/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class Sueldo {

    public Sueldo() {
    }
    
    public long calcular(ArrayList<String> idioma,int dias,long sueldo,String nombre){
    long total;
    total= sueldo*dias;
            
        if(idioma.isEmpty())
            return total;
        
        else {
            long aux =0;
            for (String recorrer:idioma){
                if(recorrer.equals("ingles"))
                    aux= aux+1000000;
                
                if(recorrer.equals("español"))
                    aux=aux+2000000;
                
                if(recorrer.equals("frances"))
                    aux=aux+3000000;
                
                if(recorrer.equals("aleman"))
                    aux=aux+5000000;
                
                    }
            total=total+aux;
            return total;
                  
                }
        
       
    
    
    }
}
