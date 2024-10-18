import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta bancaria: ");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a agência da conta bancaria: ");
        agencia = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta bancaria: ");
        saldo = Float.parseFloat(scanner.nextLine());

        String texto = "\nOlá ".concat(nomeCliente)
                .concat(" obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ").concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        System.out.println(texto);
    }
}