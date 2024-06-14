import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar scanner.

        // Exibir as mensagens para o usuário

        // Obter pela Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Agora, digite o numero de sua agencia");
        String agencia = scanner.next();

        System.out.println("Nos informe seu nome");
        String nome = scanner.next();

        System.out.println("Nos informe seu saldo");
        double saldo = scanner.nextDouble();

        // Mensagem para o usuário

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
