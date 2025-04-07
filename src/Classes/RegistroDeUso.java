/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rafaella
 */
public class RegistroDeUso {
       private cliente cliente;
    private servico servico;
    private double tempoUtilizado; // em horas

    public RegistroDeUso(cliente cliente, servico servico, double tempoUtilizado) {
        this.cliente = cliente;
        this.servico = servico;
        this.tempoUtilizado = tempoUtilizado;
    }

    public void gerarRecibo() {
        double total = calcularTotal();
        System.out.println("Recibo:");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Serviço: " + servico.getDescricao());
        System.out.println("Total: R$" + total);
    }

    public double calcularTotal() {
        return servico.getDescricao() != null ? tempoUtilizado * servico.calcularCusto() : 0;
    
}
}
