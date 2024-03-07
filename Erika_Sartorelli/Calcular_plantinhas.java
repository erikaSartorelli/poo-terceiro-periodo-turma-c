import java.util.Scanner;

public class Calcular_plantinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        while (true) {
            System.out.println("Olá, Seja bem vindo!");
            System.out.println("[1] - Fazer a soma do Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");

            int opcao ,quant  = scanner.nextInt(); 
            double precoDaPlanta, Total, valorCompra, troco = scanner.nextDouble(); 
            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade de planta vendidas:");
                    System.out.println("Digite o preço:");
                    double Total = quant * precoDaPlanta; 
                    System.out.println("O preço total é: " + Total);
                    break;
                case 2:
                    System.out.println("Digite o valor recebido:");
                    System.out.println("Digite o valor da compra:");
                    double valorCompra = scanner.nextDouble(); 
                    double troco = troco - valorCompra; 
                    System.out.println("O troco é: " + troco);
                    break;
                case 3:
                    System.out.println("Encerrando sessão...");
                    System.exit(0); 
                default:
                    System.out.println("Precione um dos numeros do menu acima!.");
            }
        }
    }
}

