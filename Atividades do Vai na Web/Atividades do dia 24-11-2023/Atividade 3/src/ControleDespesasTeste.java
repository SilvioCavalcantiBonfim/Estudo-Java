public class ControleDespesasTeste {
    public static void main(String[] args) throws Exception {
        ControleDespesas fatura = new ControleDespesas();

        fatura.adicionarDespesa(10);
        fatura.adicionarDespesa(100);
        fatura.adicionarDespesa(1000);

        System.out.printf("\nO total das despesas é R$%.2f.\n", fatura.totalDespesas());

        try {
            fatura.adicionarDespesa(-1000);
        } catch (IllegalArgumentException e) {
            System.out.printf("\nSucesso: %s\n", e.getMessage());
        }
    }
}
