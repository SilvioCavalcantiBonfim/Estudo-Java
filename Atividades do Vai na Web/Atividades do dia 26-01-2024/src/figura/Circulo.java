package figura;

public class Circulo extends Figura {

  public double raio;

  public Circulo(double raio, String cor) {
    super(cor);
    this.raio = raio;
  }

  @Override
  public double area() {
    return Math.PI*raio*raio;
  }

  @Override
  public String toString() {
    return String.format("Um circulo %s com raio %.2f.", getCor(), raio);
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double getDiametro(){
    return 2.0*raio;
  }
  
}
