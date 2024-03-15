import java.util.Scanner;

public class Desconto_em_plantinhas{
    static class Venda {
        int quantidade;
        double valorTotal;

        public Venda(int quantidade, double valorTotal) {
            this.quantidade = quantidade;
            this.valorTotal = valorTotal;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double desconto = 0;
        int quantidadeVendida = 0;
        double valorVendaTotal = 0;
        Venda[] registroVendas = new Venda[100];
        int vendasRegistradas = 0; 

        while (true) {
            System.out.println("Ola, seja bem vindo ao menu. :)");
            System.out.println("[1] - Digite para calcular a compra");
            System.out.println("[2] - Digite para registrar a venda");
            System.out.println("[3] - Digite para calcular o Troco");
            System.out.println("[4] - Sair");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite a quantidade da planta:");
                    int quantidade = scanner.nextInt();
                    System.out.println("Digite o preço planta:");
                    double precoUni = scanner.nextDouble();
                    double Total = quantidade * precoUni;

                    if (quantidade > 10) {
                        desconto = Total * 0.05; // 5% de desconto
                        Total -= desconto;
                        System.out.println("Desconto Especial de 5% aplicado.");
                    }

                    System.out.println("O preço total é: " + Total);
                    break;

                case 2:
                    System.out.println("Registro de Venda:");
                    System.out.println("Digite a quantidade de plantas vendidas:");
                    int quantidadeVendidaInput = scanner.nextInt();
                    System.out.println("Digite o valor total da venda:");
                    double valorVenda = scanner.nextDouble();

                    registroVendas[vendasRegistradas] = new Venda(quantidadeVendidaInput, valorVenda);
                    vendasRegistradas++;

                    quantidadeVendida += quantidadeVendidaInput;
                    valorVendaTotal += valorVenda;

                    System.out.println("Venda registrada com sucesso.");
                    break;

                case 3:
                    System.out.println("Digite o valor recebido:");
                    double valorRecebido = scanner.nextDouble();
                    System.out.println("Digite o valor total da compra:");
                    double Compra = scanner.nextDouble();
                    double troco = calcularTroco(valorRecebido, Compra);
                    System.out.println("O troco é: " + troco);
                    break;

                case 4:
                    System.out.println("Encerrando Sessão ");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Use os digitos dado no menu");
            }
        }
    }

    public static double calcularTroco(double valorRecebido, double valorCompra) {
        return valorRecebido - valorCompra;
    }
}
