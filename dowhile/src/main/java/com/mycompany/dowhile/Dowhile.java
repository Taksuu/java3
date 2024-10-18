/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhile;

/**
 *
 * @author Admin
 */
public class Dowhile {
    public static void main(String[] args) {
        int contador = 10;
        do {
            System.out.println(contador);
            contador--;
        } while (contador > 0);
        System.out.println("Contagem regressiva acabada");
    }
}