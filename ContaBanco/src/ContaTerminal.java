import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Exibir as mensagens para o usuário

        // Obter pela Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite o número da sua conta! ");
            int conta = scanner.nextLine();

            System.out.println("Agora, digite o numero de sua agencia!");
            String agencia = scanner.nextLine();

            System.out.println("Nos informe seu nome!");
            String nome = scanner.nextLine();

            System.out.println("Nos informe seu saldo.");
            String saldo = scanner.nextLine();

            // Mensagem para o usuário

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é a "
                    + agencia
                    + ", a sua conta é a " + conta + " e seu saldo é de " + saldo
                    + " e já está disponível para saque.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, reinicie o programa e insira os valores corretamente.");
        }
        scanner.close();
    }
}
