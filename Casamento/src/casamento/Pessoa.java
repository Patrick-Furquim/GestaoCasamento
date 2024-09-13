/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casamento;

/**
 *
 * @author victo
 */
public class Pessoa {
    int id;
    String nome;
    String nascimento;
    String telefone;
    String dataCriacao;
    String dataModificacao;
    
    //Metodos
    static public Pessoa criarPessoa(IntFunc id){
        Pessoa pessoa = new Pessoa();
        
        return pessoa;
    }
}
