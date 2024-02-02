package figura;

public class Triangulo extends Figura {

  public double base;
  public double altura;

  public Triangulo(double base, double altura, String cor) {
    super(cor);
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double area() {
    return base*altura/2.0f;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  @Override
  public String toString() {
    return String.format("Um triângulo %s com com base %.2f e altura %.2f.", getCor(), base, altura);
  }
  
}
