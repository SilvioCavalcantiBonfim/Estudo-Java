package Calc;

public class Calc {
  
  public static double soma(double...numbers){
    double sum = 0;
    for (double n : numbers) {
      sum += n;
    }
    return sum;
  }

  public static double subtracao(double...numbers){
    double sum = 0;
    for (double n : numbers) {
      sum -= n;
    }
    return sum;
  }

  public static double multiplicacao(double...numbers){
    double sum = 1;
    for (double n : numbers) {
      sum *= n;
    }
    return sum;
  }

  public static double divisao(double...numbers){
    double sum = 1;
    for (double n : numbers) {
      sum /= n;
    }
    return sum;
  }
}
