/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo.unidad01.ao_ag.ejmplo;

/**
 *
 * @author PC-2
 */
public class PooUnidad01AO_AGEjmplo {

    public static void main(String[] args) {
        System.out.println("01_01_02");
        System.out.println("-----------MI PERRO---------"); 
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        perro1.nombre = "firulais";
        perro1.edad = 21;
        perro1.raza = "mestizo";
        System.out.println("Perro se llama "+perro1.nombre);
        System.out.println("edad "+perro1.edad);
        System.out.println("raza "+perro1.raza);
        
        System.out.println("--------PERRO 2 ------");
        perro2.nombre = "ANDRES";
        perro2.edad = 1;
        perro2.raza = "PUDUL";
        System.out.println("Perro se llama "+perro2.nombre);
        System.out.println("edad "+perro2.edad);
        System.out.println("raza "+perro2.raza);
        
        System.out.println("--------PERRO 3 ------");
        perro3.nombre = "ALEXIS";
        perro3.edad = 1;
        perro3.raza = "PASTOR";
        System.out.println("Perro se llama "+perro3.nombre);
        System.out.println("edad "+perro3.edad);
        System.out.println("raza "+perro3.raza);
        
        System.out.println("--------AUTO-------");
        var auto1 = new Auto();
        var auto2 = new Auto();
        var auto3 = new Auto();
        auto1.ano = 2016;
        auto1.marca = "chevrolet";
        auto1.placa = "AVB-525";
        System.out.println("Auto del año "+auto1.ano);
        System.out.println("Marca "+auto1.marca);
        System.out.println("Placa "+auto1.placa);
        
        System.out.println("--------COMPUTADORA---------");
        var comp1 = new Computadora();
        var comp2 = new Computadora();
        var comp3 = new Computadora();
        comp1.capacidad = 65;
        comp1.marca = "lex";
        comp1.modelo = "I8";
        System.out.println("Capacidad "+comp1.capacidad);
        System.out.println("Marca "+comp1.marca);
        System.out.println("Modelo "+comp1.modelo);
        
        
        
        
    }
}
