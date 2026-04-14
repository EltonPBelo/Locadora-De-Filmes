package Recursos;

import java.time.LocalDateTime;
import Filmes.Filme;
import Pessoas.Cliente;

public class Aluguel {
    
   private Cliente nomeCliente;
   private Filme nomeFilme;
   private LocalDateTime dataRetirada;
   private LocalDateTime dataDevolucao;
   private Boolean statusAluguel;

  
   public Aluguel(Cliente nomeCliente, Filme nomeFilme) {
    this.nomeCliente = nomeCliente;
    this.nomeFilme = nomeFilme;
    this.dataRetirada = LocalDateTime.now();
    this.statusAluguel = true; // O aluguel começa como ativo pois o filme foi retirado, e só se torna inativo quando for devolvido.
}
   public Cliente getNomeCliente() {
    return nomeCliente;
   }
   public void setNomeCliente(Cliente nomeCliente) {
    this.nomeCliente = nomeCliente;
   }
   public Filme getNomeFilme() {
    return nomeFilme;
   }
   public void setNomeFilme(Filme nomeFilme) {
    this.nomeFilme = nomeFilme;
   }
   public LocalDateTime getDataRetirada() {
    return dataRetirada;
   }
   public void setDataRetirada(LocalDateTime dataRetirada) {
    this.dataRetirada = dataRetirada;
   }
   public LocalDateTime getDataDevolucao() {
    return dataDevolucao;
   }
   public void setDataDevolucao(LocalDateTime dataDevolucao) {
    this.dataDevolucao = dataDevolucao;
   }
   public Boolean getStatusAluguel() {
    return statusAluguel;
   }
   public void setStatusAluguel(Boolean statusAluguel) {
    this.statusAluguel = statusAluguel;
   }









    // 1. ATRIBUTOS (Todos private)
    // O que um Aluguel precisa de guardar?
    // - O cliente que alugou (Dica: o tipo da variável será Cliente)
    // - O filme que foi alugado (Dica: o tipo será Filme)
    // - A data e hora da retirada (Dica: usar LocalDateTime)
    // - A data e hora da devolução (Dica: usar LocalDateTime)
    // - O status do aluguer (Dica: usar um boolean, ex: isAtivo, ou uma String "Pendente"/"Devolvido")


    // 2. CONSTRUTOR
    // Pensa no que acontece no momento exato no balcão da locadora.
    // Para criares um novo Aluguel, o sistema precisa apenas de saber QUEM é o cliente e QUAL é o filme.
    // A data de devolução ainda não existe no momento do aluguer!
    // E a data de retirada deve ser registada automaticamente nesse exato momento.
    // Dica de Java: Para capturar a hora exata do sistema, usas LocalDateTime.now()

    
    // 3. GETTERS E SETTERS
    // (Podes gerá-los depois de definires os atributos)






}
