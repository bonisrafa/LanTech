/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rafaella
 */
public class servico {
    
     private String descricao;
    private double valorPorHora;
    private double duracao; // em horas
    private double valorTotal;

    public servico(String descricao, double valorPorHora, double duracao) {
        this.descricao = descricao;
        this.valorPorHora = valorPorHora;
        this.duracao = duracao;
    }

    public double calcularCusto() {
        valorTotal = valorPorHora * duracao;
        return valorTotal;
    }

    // Getters
    public String getDescricao() {
        return descricao;
    
}
}
