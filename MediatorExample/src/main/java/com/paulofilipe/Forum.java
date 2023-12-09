package com.paulofilipe;

import java.util.ArrayList;
import java.util.List;

public class Forum implements ForumMediator {

    // Lista de usuários no fórum
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {
        // Simulando lógica de encaminhamento da mensagem para todos os usuários
        System.out.println("Mensagem enviada para todos os usuários no fórum.");
        for (Usuario u : usuarios) {
            if (u != usuario) {  // Não enviar a mensagem para o remetente
                u.receberMensagem(mensagem);
            }
        }
    }
}