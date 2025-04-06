/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio23;

/**
 *
 * @author cauac
 */
import javax.swing.JOptionPane;
public class Exercicio23 {

    public static void main(String[] args) {
        int SOMA = 0;
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o ultimo número: "));

        
                    while(n1<=n2){
                        SOMA = SOMA + n1;
                        n1++;
                    }
                    JOptionPane.showMessageDialog(null,"A soma de todos os numeros é:" + SOMA);
    }
}
