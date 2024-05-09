import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o identificador da Agência:");
        scanner.nextLine(); //Consumir quebra de linha, para evitar erro de buffer.
        agencia= scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente= scanner.nextLine();

        System.out.println("Por favor, digite o saldo a depositar na conta:");
        saldo= scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.", nomeCliente, agencia, numero,saldo);

        scanner.close(); //Desalocar o objeto scanner da memória.
        
}
}
