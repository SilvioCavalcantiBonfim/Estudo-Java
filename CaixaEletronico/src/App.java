import java.math.BigDecimal;
import bankingOperations.BankingOperations;
import exception.IllegalBalanceException;
import exception.IllegalInputException;
import userInputHandler.UserInputHandler;

public class App {

    private static final BankingOperations bank = BankingOperations.builder();
    private static final UserInputHandler userInput = UserInputHandler.builder();

    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                int option = getOptionFromUser();
                processOperation(option);
            } catch (IllegalInputException | IllegalBalanceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static int getOptionFromUser(){
        System.out.print("\n1 - Verificar saldo\n2 - Depositar dinheiro\n3 - Sacar dinheiro\n0 - Sair\nEscolha uma das operações: ");
        return  userInput.getOption();
    }

    private static void processOperation(int option) {
        switch (option) {
            case 0 -> exit();
            case 1 -> getBalance();
            case 2 -> deposit();
            case 3 -> draft();
            default -> System.out.println("Operação inválida.");
        };
    }

    private static void exit() {
        userInput.close();
        System.exit(0);
    }

    private static void getBalance() {
        System.out.println(String.format("\nSaldo atual: R$ %s",bank.getBalance()));
    }

    private static void draft() {
        System.out.print("Informe o valor a ser retirado [R$]:");
        BigDecimal valorDeSaque = userInput.getAmount();
        bank.draft(valorDeSaque);
    }

    private static void deposit() {
        System.out.print("Informe o valor a ser depositado [R$]:");
        BigDecimal valorDeDeposito = userInput.getAmount();
        bank.deposit(valorDeDeposito);
    }

}
