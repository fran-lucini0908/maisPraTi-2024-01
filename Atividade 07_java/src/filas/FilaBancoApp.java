package filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Classe que representa um cliente
class Cliente {
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

// Classe que gerencia a fila de atendimento no banco
class FilaBanco {
    private Queue<Cliente> fila;

    public FilaBanco() {
        this.fila = new LinkedList<>();
    }

    // Adiciona um cliente à fila
    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
        System.out.println("Cliente adicionado: " + cliente);
    }

    // Chama o próximo cliente da fila
    public void chamarProximoCliente() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum cliente na fila.");
        } else {
            Cliente cliente = fila.poll();
            System.out.println("Atendendo cliente: " + cliente);
        }
    }

    // Exibe todos os clientes na fila
    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Clientes na fila:");
            for (Cliente cliente : fila) {
                System.out.println(cliente);
            }
        }
    }
}

// Classe principal para interação com o usuário
public class FilaBancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaBanco filaBanco = new FilaBanco();

        String opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Chamar próximo cliente");
            System.out.println("3. Exibir fila");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine().trim(); // Remove espaços em branco

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do cliente a ser adicionado: ");
                    String nomeCliente = scanner.nextLine();
                    filaBanco.adicionarCliente(new Cliente(nomeCliente));
                    break;
                case "2":
                    filaBanco.chamarProximoCliente();
                    break;
                case "3":
                    filaBanco.exibirFila();
                    break;
                case "4":
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (!opcao.equals("4"));

        scanner.close();
    }
}

