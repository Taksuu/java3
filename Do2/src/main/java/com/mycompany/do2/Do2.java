/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.do2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Do2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 1111;
        int senhaEscr;
        
        do {
            System.out.println("Digite a senha");
            senhaEscr = scanner.nextInt();
            
            if (senhaEscr != senha) {
                System.out.println("Senha incorreta. Tente outra vez.");
            

}
        } while (senhaEscr != senha);
        
        System.out.println("Senha correta");
        scanner.close();
        
        
        
        
}
    
}
    


    