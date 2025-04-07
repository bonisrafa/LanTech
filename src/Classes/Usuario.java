/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rafaella
 */
public class Usuario {
    
     private String nome;
   
    private String login;
    private String senha;
    

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.login = nome.toLowerCase(); // login é o nome em minúsculo
        this.senha = cpf.substring(0, 4); // senha são os 4 primeiros dígitos do CPF
       
    }

    public boolean validarLogin(String loginDigitado, String senhaDigitada) {
        return this.login.equalsIgnoreCase(loginDigitado) && this.senha.equals(senhaDigitada);
    }

    public void cadastrarClientes(cliente cliente) {
        // Lógica para cadastrar cliente
        System.out.println("Cliente cadastrado: " + cliente.getNome());
    }

    public void gerarRelatorio() {
        // Lógica para chamar relatório (pode chamar classe Relatorio)
        System.out.println("Relatório gerado.");
    }

    // Getters (opcional, caso precise acessar os dados depois)
    public String getNome() {
        return nome;
    }
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

}