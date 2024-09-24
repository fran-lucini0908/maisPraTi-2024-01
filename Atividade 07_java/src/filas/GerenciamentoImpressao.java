package filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Classe que representa um trabalho de impressão
class TrabalhoImpressao {
    private String descricao;

    public TrabalhoImpressao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Trabalho de Impressão: " + descricao;
    }
}

// Classe que gerencia a fila de trabalhos de impressão
public class GerenciamentoImpressao {
    private Queue<TrabalhoImpressao> fila;

    public GerenciamentoImpressao() {
        this.fila = new LinkedList<>();
    }

    // Adiciona um trabalho de impressão à fila
    public void adicionarTrabalho(TrabalhoImpressao trabalho) {
        fila.add(trabalho);
        System.out.println("Trabalho adicionado à fila: " + trabalho);
    }

    // Processa o trabalho de impressão mais antigo da fila
    public void processarTrabalho() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum trabalho na fila para processar.");
        } else {
            TrabalhoImpressao trabalho = fila.poll();
            System.out.println("Processando trabalho: " + trabalho);
        }
    }

    // Exibe todos os trabalhos na fila
    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila de trabalhos está vazia.");
        } else {
            System.out.println("Trabalhos na fila:");
            for (TrabalhoImpressao trabalho : fila) {
                System.out.println(trabalho);
            }
        }
    }
}

// Classe principal para interação com o usuário
class GerenciamentoImpressaoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoImpressao gerenciamento = new GerenciamentoImpressao();

        String opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar trabalho de impressão");
            System.out.println("2. Processar trabalho de impressão");
            System.out.println("3. Exibir fila de trabalhos");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine().trim(); // Remove espaços em branco

            switch (opcao) {
                case "1":
                    System.out.print("Digite a descrição do trabalho de impressão: ");
                    String descricao = scanner.nextLine();
                    gerenciamento.adicionarTrabalho(new TrabalhoImpressao(descricao));
                    break;
                case "2":
                    gerenciamento.processarTrabalho();
                    break;
                case "3":
                    gerenciamento.exibirFila();
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

