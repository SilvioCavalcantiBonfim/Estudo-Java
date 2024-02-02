package pagamento;

import java.util.Random;

public class Pix implements Pagamento{

  private final String chavePix;
  private final Random rng = new Random();

  public Pix(String chavePix) {
    this.chavePix = chavePix;
  }

  @Override
  public void efetuarPagamento(double valor) throws InterruptedException {
    System.out.print("Efetuando o pagamento");
    Long delay = (long) (rng.nextGaussian()*2000);
    for (int i = 0; i < 3; i++) {
      System.out.print(".");
      Thread.sleep(Math.abs(delay/3));
    }
    if(rng.nextBoolean()){
      System.out.printf("✅ Pagamento no valor de R$ %.2f efetuado para a chave pix %s.\n",valor, chavePix);
    }else{
      System.out.printf("❌ Pagamento falhou. Tentando novamente.\n");
      efetuarPagamento(valor);
    }
  }
  
}
