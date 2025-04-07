/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rafaella
 */
public class produto {
     private String nome;
    private double valor;

    public produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public double getValor() { return valor; }
    
}
