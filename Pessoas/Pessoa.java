package Pessoas;

import Dados.Cpf;
import Dados.Endereco;
import Dados.Nome;
import Dados.Telefone;

public abstract class Pessoa{

    private Cpf cpf;
    private Endereco endereco;
    private Nome nome;
    private Telefone telefone;

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

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
