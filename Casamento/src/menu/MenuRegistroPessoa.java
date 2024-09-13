/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

/**
 *
 * @author victo
 */

import casamento.Pessoa;
import javax.swing.JOptionPane;

public class MenuRegistroPessoa {
    public static void exibirMenu() {
        JOptionPane.showMessageDialog(null, "Registrar Pessoa: \n\n");
        String nome = JOptionPane.showInputDialog("Qual o nome:");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento (no seguinte formato: 00/00/0000):");
        String telefone = JOptionPane.showInputDialog("Qual o telefone:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:"));
        
        //Pessoa novaPessoa = new Pessoa(id, nome, dataNascimento, telefone);
        
        JOptionPane.showMessageDialog(null, "Pessoa registrada!!!");
    }
}
