package pagamento;

public interface Pagamento {
  void efetuarPagamento(double valor) throws InterruptedException;
}
