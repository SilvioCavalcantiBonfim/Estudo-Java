import java.util.List;

import pagamento.CartaoCredito;
import pagamento.Pagamento;
import pagamento.Pix;

public class AppPagamento {
    public static void main(String[] args) throws Exception {
        List<Pagamento> pagamentos = List.of(
            new CartaoCredito("123"),
            new CartaoCredito("456"),
            new Pix("123abc"),
            new Pix("321efg")
        );

        List<Double> valores = List.of(12.2, 800.0, 1000.50);

        for (Double value : valores) {
            for (Pagamento pagamento : pagamentos) {
                pagamento.efetuarPagamento(value);
            }
        }
    }
}
