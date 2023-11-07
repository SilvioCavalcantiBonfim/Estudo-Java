public final class CarroEletrico extends Carro {

  private float bateria;

  public CarroEletrico(String marca, String modelo, short ano) {
    super(marca, modelo, ano);
  }

  @Override
  public void acelerar() {
    System.out.println("O carro está acelerando.");
  }

  @Override
  public void frear() {
    System.out.println("O carro está freiando.");
  }
  
  public void recarregar(){
    System.out.println("O carro está recarregando.");
  }

  public float getBateria(){
    return bateria;
  }

}
