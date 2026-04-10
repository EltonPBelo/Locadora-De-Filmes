package Pessoas;

import Dados.Cpf;
import Dados.Endereco;
import Dados.Nome;
import Dados.Telefone;

public abstract class Pessoa{

    @SuppressWarnings("unused")
    private Cpf cpf;

    @SuppressWarnings("unused")
    private Endereco endereco;

    @SuppressWarnings("unused")
    private Nome nome;

    @SuppressWarnings("unused")
    private Telefone telefone;

    public Pessoa() {
        
    }
    
    public Pessoa(Cpf cpf, Nome nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoa(Cpf cpf, Endereco endereco, Nome nome, Telefone telefone) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }
    

}
