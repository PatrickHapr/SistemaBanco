package sisbanco;

import sisbanco.bd.BancoDeDados;
import sisbanco.entities.Cliente;
import sisbanco.view.TelaPrincipal;

public class StartApp {
    public static void main(String[] args) {
        seedBancoDeDados();
        TelaPrincipal.main(args);
    }

    private static void seedBancoDeDados() {
        BancoDeDados.adicionarCliente(new Cliente("João Silva", "Santos", "123456789", "47769080002", "Rua A, 123"));
        BancoDeDados.adicionarCliente(new Cliente("Maria Oliveira", "Sousa", "987654321", "50622152009", "Av. B, 456"));
        BancoDeDados.adicionarCliente(new Cliente("Pedro Almeida", "Silveira", "654987321", "05728038000", "Rua C, 789"));
    }
}
