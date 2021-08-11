/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoConta;

/**
 *
 * @author cesar
 */
public class cliente {
    public String nome;
    public String cpf;

    public cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    
}
