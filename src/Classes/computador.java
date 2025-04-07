/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rafaella
 */
public class computador {
        private int numero;
    private boolean ocupado;
    private String cliente;
    private String tempoUso;

    public computador(int numero) {
        this.numero = numero;
        this.ocupado = false;
        this.cliente = "---";
        this.tempoUso = "---";
    }

    // Getters e Setters
    public int getNumero() { return numero; }

    public boolean isOcupado() { return ocupado; }
    public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getTempoUso() { return tempoUso; }
    public void setTempoUso(String tempoUso) { this.tempoUso = tempoUso; }
    
}
