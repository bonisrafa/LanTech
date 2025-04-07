/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import lantech.telaRegistroUso;

/**
 *
 * @author Rafaella
 */
public class Relatorio {
    
    public void gerarRecibo(RegistroDeUso registro) {
        registro.gerarRecibo();
    }

    public double calcularTotal(RegistroDeUso registro) {
        return registro.calcularTotal();
    }
    
}
