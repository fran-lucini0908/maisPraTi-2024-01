package listaSimplesEncadeadas;

import java.util.Scanner;

// Classe que representa um nó na lista encadeada (uma ação realizada)
class AcaoNode {
    String acao;
    AcaoNode proxima;

    public AcaoNode(String acao) {
        this.acao = acao;
        this.proxima = null;
    }

    @Override
    public String toString() {
        return acao;
    }
}

// Classe que gerencia o sistema de controle de reversão
class ControleReversao {
    private AcaoNode topo;

    public ControleReversao() {
        this.topo = null;
    }

    // Método para realizar uma nova ação e adicioná-la à lista
    public void realizarAcao(String acao) {
        AcaoNode novaAcao = new AcaoNode(acao);
        novaAcao.proxima = topo;
        topo = novaAcao;
        System.out.println("Ação realizada: " + acao);
    }

    // Método para desfazer a última ação
    public void desfazerAcao() {
        if (topo == null) {
            System.out.println("Nenhuma ação para desfazer.");
        } else {
            System.out.println("Desfazendo a ação: " + topo.acao);
            topo = topo.proxima;
        }
    }

    // Exibe o histórico de ações
    public void exibirHistorico() {
        if (topo == null) {
            System.out.println("Nenhuma ação realizada.");
            return;
        }

        AcaoNode atual = topo;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.proxima;
        }
    }
}

// Classe principal para interação com o usuário
public class ControleReversaoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleReversao controleReversao = new ControleReversao();

        String opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Realizar ação");
            System.out.println("2. Desfazer última ação");
            System.out.println("3. Exibir histórico de ações");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite a ação a ser realizada: ");
                    String acao = scanner.nextLine();
                    controleReversao.realizarAcao(acao);
                    break;
                case "2":
                    controleReversao.desfazerAcao();
                    break;
                case "3":
                    System.out.println("Histórico de Ações:");
                    controleReversao.exibirHistorico();
                    break;
                case "4":
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("4"));

        scanner.close();
    }
}
