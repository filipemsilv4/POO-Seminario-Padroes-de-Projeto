package com.paulofilipe;

public class Usuario {
    private String nome;
    private ForumMediator mediator;

    public Usuario(String nome, ForumMediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public String getNome() {
        return nome;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviou uma mensagem: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}