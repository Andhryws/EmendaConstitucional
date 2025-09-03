import java.util.*;

public class Main{
    private static List<Emenda> emendas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n==== MENU DE EMENDAS ====");
            System.out.println("1 - Cadastrar emenda");
            System.out.println("2 - Listar emendas");
            System.out.println("3 - Consultar total");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarEmenda();
                case 2 -> listarEmendas();
                case 3 -> consultarTotalPorFase();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarEmenda() {
        System.out.print("Ano: ");
        int ano = sc.nextInt(); sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Possui apoiador? (true/false): ");
        boolean apoiador = sc.nextBoolean();
        
        Emenda e = new Emenda(ano, tipo, autor, numero, apoiador, "", "", "", "", "", "", "", 0,0,0,0,0,0);
        emendas.add(e);
        System.out.println("Emenda cadastrada com sucesso");
    }

    private static void listarEmendas() {
        if (emendas.isEmpty()) {
            System.out.println("Nenhuma emenda cadastrada");
            return;
        }
        for (int i = 0; i < emendas.size(); i++) {
            System.out.println(i + " - " + emendas.get(i));
        }
    }

    private static void consultarTotalPorFase() {
        listarEmendas();
        System.out.print("Escolha o índice da emenda: ");
        int idx = sc.nextInt(); sc.nextLine();
        System.out.print("Digite a fase: ");
        String fase = sc.nextLine();

        double total = emendas.get(idx).calcTotalporFase(fase);
        System.out.println("Total da fase '" + fase + "': R$ " + total);
    }
}
