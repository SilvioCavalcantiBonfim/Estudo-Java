public final class Fatura {
  private final String numeroProduto;
  private final String descricao;
  private final int quantidade;
  private final double preco;
  
  public Fatura(String numeroProduto, String descricao, int quantidade, double preco) {
    this.numeroProduto = numeroProduto;
    this.descricao = descricao;
    if (quantidade < 0) {
      throw new IllegalArgumentException("Não é possivel ter quantidade negativa de produtos.");
    }
    this.quantidade = quantidade;
    if (preco < 0) {
      throw new IllegalArgumentException("O produto não pode ter valor negativo.");
    }
    this.preco = preco;
  }
  
  public double getValorTotal(){
    return quantidade*preco;
  }

  public String getNumeroProduto() {
    return numeroProduto;
  }

  public String getDescricao() {
    return descricao;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public double getPreco() {
    return preco;
  }
}
