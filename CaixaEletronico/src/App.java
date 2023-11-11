import java.math.BigDecimal;
import bankingOperations.BankingOperations;
import exception.IllegalBalanceException;
import exception.IllegalInputException;
import userInputHandler.UserInputHandler;
import menu.Menu;

public class App {

    private static final BankingOperations bank = BankingOperations.builder();
    private static final UserInputHandler userInput = UserInputHandler.builder();
    private static final Menu<Integer> menu = Menu.<Integer>builder();

    public static void main(String[] args) throws Exception {
        setupMenu();
        while (true) {
            try {
                int option = getOptionFromUser();
                menu.execute(option);
            } catch (IllegalInputException | IllegalBalanceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static void setupMenu() {
        menu.registerAction(0, "Sair", () -> App.exit());
        menu.registerAction(1, "Verificar saldo", () -> App.getBalance());
        menu.registerAction(2, "Depositar dinheiro", () -> App.deposit());
        menu.registerAction(3, "Sacar dinheiro", () -> App.draft());
        menu.registerDefualtAciton(() -> System.out.println("Operação inválida."));
    }

    private static int getOptionFromUser(){
        System.out.printf("%s\nEscolha uma das operações: ", menu.generateMenuString());
        return  userInput.getOption();
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
