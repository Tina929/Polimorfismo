/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora2;

import javax.swing.JOptionPane;

public class CalculadoraEspecial implements InterfazCalculadora {
    
    int numero1;
    int numero2;
    
    public CalculadoraEspecial() {
    }
    
    public CalculadoraEspecial (int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    } 
    @Override
    public void solicitarNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero1 para Calculadora Especial"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero2 para Calculadora Especial"));
    }
    
    @Override
    public int sumarEnteros() {
        return (numero1 + numero2)/2;
    }

    @Override
    public int restarEnteros() {
        return (numero1 - numero2)/2;
    }

    @Override
    public int multiplicarEnteros() {
        return (numero1 * numero2)/2;
    }

    @Override
    public int dividirEnteros() {
        return (numero1 / numero2)/2;
    }

    @Override
    public double calcularRaizCuadrada() {
        return (Math.sqrt (numero1))/2;
    }   
}
