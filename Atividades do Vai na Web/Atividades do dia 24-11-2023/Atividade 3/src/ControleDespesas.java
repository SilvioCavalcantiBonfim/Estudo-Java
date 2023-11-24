import java.util.ArrayList;
import java.util.List;

public final class ControleDespesas {
  
  private List<Double> despesas = new ArrayList<>();
  
  public void adicionarDespesa(double despesa){
    if (despesa <= 0) {
      throw new IllegalArgumentException("Uma despesa tem que ser maior ou igual a zero.");
    }
    despesas.add(despesa);
  }

  public double totalDespesas(){
    double totalDespesa = 0;
    for (Double despesa : despesas) {
      totalDespesa += despesa;
    }
    return totalDespesa;
  }

}
