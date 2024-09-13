/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import javax.swing.JOptionPane;

public class MenuInicial {

    public static void main(String[] args) {
        exibirMenuInicial();
    }

    public static void exibirMenuInicial() {
        
        String menu = "Bem Vindo ao Gerenciador de Casamento!\n";
        menu += "Selecione uma opcao: \n\n";
        menu += "1 - Logar\n";
        menu += "2 - Registrar Pessoa\n";
        menu += "3 - Registrar Usuario\n";
        menu += "4 - Entrar sem Logar";
        
        int opcao = 999;
        
        do{
            opcao = Integer.getInteger(JOptionPane.showInputDialog(null, menu));
            switch (opcao) {
             case 1: // Logar
                 System.out.println("1");
                 break;
             case 2: // Registrar Pessoa
                 break;
             case 3: // Registrar Usuario
                 break;
             case 4: // Entrar sem logar
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Opção inválida! Tente Novamente!");
                 break;
                
        } 
        }while(opcao != 0);
        
        
        
    }
}



