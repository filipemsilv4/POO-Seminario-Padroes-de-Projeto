package com.paulofilipe;

public class Main {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Usuario usuario1 = new Usuario("Ana Zaira", forum);
        Usuario usuario2 = new Usuario("Beatriz Yana", forum);
        Usuario usuario3 = new Usuario("Cecília Xerxes", forum);

        forum.adicionarUsuario(usuario1);
        forum.adicionarUsuario(usuario2);
        forum.adicionarUsuario(usuario3);

        usuario1.enviarMensagem("Olá a todos!");
        System.out.println();

        usuario2.enviarMensagem("E aí, pessoal?");
    }
}