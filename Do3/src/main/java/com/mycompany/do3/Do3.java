/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.do3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Do3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont=0;
        int num;
        
       do {
           System.out.println("Digite um número INT");
           num = scanner.nextInt();
           
           if (num != 0) {
               cont++;
           }
         
       }while (num !=0); 
       
       System.out.println("Você inseriu" +cont+ "números.");
       scanner.close();
        
       
           }
           
       }
      
    

