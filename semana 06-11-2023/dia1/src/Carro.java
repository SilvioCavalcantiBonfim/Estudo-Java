public abstract class Carro {

  private final String marca;

  private final String modelo;
  
  private final short ano;

  public Carro(String marca, String modelo, short ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public abstract void acelerar();

  public abstract void frear();

  public String getMarca(){
    return this.marca;
  }

  public String getModelo(){
    return this.modelo;
  }

  public short getAno(){
    return this.ano;
  }
}
