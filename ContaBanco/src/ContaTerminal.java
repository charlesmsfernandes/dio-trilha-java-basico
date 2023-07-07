import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Estou utilizando a estrutura try-with-resources
        // para garantir que o Scanner seja fechado mesmo se uma exceção ocorrer
        // e liberar os recursos associados a ele
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroConta;
            String agencia = ""; 
            String nomeCliente = "";
            double saldo; 

            System.out.print("Por favor, digite o número da Conta: ");
            numeroConta = scanner.nextInt();

            System.out.print("Por favor, digite o número da Agência com - e digito (Ex: 067-8): ");
            agencia = scanner.next();

            // O scanner.next(), lê apenas a próxima sequência de caracteres até o próximo espaço em branco 
            // ou quebra de linha. No entanto, ele não consome a quebra de linha. 
            // Isso significa que, quando eu chamo o scanner.nextLine() imediatamente após scanner.next(), 
            // ele encontra essa quebra de linha pendente e a consome, gerando um erro a aplicação.
            // como scanner.nextLine() abaixo eu consumo a quebra de linha restante.
            scanner.nextLine(); 

            System.out.print("Por favor, digite o seu nome completo: ");
            nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o seu Saldo atual (Ex: 237.48): ");
            saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        }
    }
}
