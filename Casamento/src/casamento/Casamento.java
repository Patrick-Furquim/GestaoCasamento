/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casamento;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Casamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 0;
        IntFunc id = new IntFunc();
        id.inteiro = 0;
        Scanner scanner = new Scanner(System.in);
        
        String telaInicial = "----- Bem Vinde! -----\n"
                + "Casamento de " + noivo.nome + " e " + noiva.nome + "\n"
                + "Data: " + evento.data + " - Local: " + evento.igreja.nome; + "\n";
                
        String cadastroNoivos = "Cadastro Noivos \n Informacoes do noivo: ";
        System.out.println(cadastroNoivos);
        Pessoa noivo = Pessoa.criarPessoa(id);
       
        
                        
        
        switch(opc) {
            case 1:
                
            break;
        }
    }
    
}
