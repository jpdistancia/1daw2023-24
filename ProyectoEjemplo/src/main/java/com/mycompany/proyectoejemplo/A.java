/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoejemplo;

/**
 *
 * @author Profesor
 */
public class A 
{
    private int at1;

    public A() 
    {
        this.at1 = 0;
        //Esto lo pongo desde github pra comprobar que todo funciona correctamente
    }

    public A(int at1) 
    {
        this.at1 = at1;
        //Esto lo pongo desde netbeans para comprobar que funciona bien
    }

    public int getAt1() 
    {
        return at1;
        //Vuelvo a probar todo esto: netbeans -> github
    }

    public void setAt1(int at1) 
    {
        this.at1 = at1;
    }

    @Override
    public String toString() {
        return "A{" + "at1=" + at1 + '}';
    }
    
    
    
    
    
    
    
}
