/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDateTime;

/**
 *
 * @author Rafaella
 */
public class vendas {
    
     private int idVenda;
    private cliente cliente;
    private produto produto;
    private double valor;
    private String dataHora;

    public vendas(int idVenda, cliente cliente, produto produto, double valor, String dataHora) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.dataHora = dataHora;
    }

    // Getters e Setters
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public produto getProduto() {
        return produto;
    }

    public void setProduto(produto produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    // Exemplo de exibição simples
    public void exibirResumoVenda() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data/Hora: " + dataHora);
    
}
}
