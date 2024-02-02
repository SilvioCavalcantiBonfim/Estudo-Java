package pagamento;

import java.util.Random;

public class CartaoCredito implements Pagamento{

  private final String numeroCartao;
  private final Random rng = new Random();

  public CartaoCredito(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  @Override
  public void efetuarPagamento(double valor) throws InterruptedException {
    System.out.print("Efetuando o pagamento");
    Long delay = 750 + (long) (rng.nextGaussian()*3000);
    for (int i = 0; i < 3; i++) {
      System.out.print(".");
      Thread.sleep(Math.abs(delay/3));
    }
    if(rng.nextBoolean()){
      System.out.printf("✅ Pagamento no valor de R$ %.2f efetuado no cartão de credito com número %s.\n",valor, numeroCartao);
    }else{
      System.out.printf("❌ Pagamento falhou. Tentando novamente.\n");
      efetuarPagamento(valor);
    }
  }
  
}
