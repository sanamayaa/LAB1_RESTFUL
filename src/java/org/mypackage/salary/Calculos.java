/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.salary;

/**
 *
 * 
 */
public class Calculos {
 private String name;
    private int fecha;
    private int salario;
    private int resultado1;
    private int resultado2;

    public int getResultado2() {
        resultado2=((2020-fecha)* salario)/ 3;
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }

    public void setResultado1(int resultado1) {
        this.resultado1 = resultado1;
    }
    
    public Calculos(){
        name= null;
        fecha=0;
        salario = 0;
        resultado1=0;
        resultado2=0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param name the name to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
            
}