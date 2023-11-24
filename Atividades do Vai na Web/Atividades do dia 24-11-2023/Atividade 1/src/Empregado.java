import java.util.regex.Pattern;

public class Empregado {
  private final String nome;
  private final String cpf;
  private final double salarioMensal;
  
  public Empregado(String nome, String cpf, double salarioMensal) {
    this.nome = nome;
    if (cpfIsInvalid(cpf)) {
      throw new IllegalArgumentException("CPF no formato inválido. Deve ser na forma xxx.xxx.xxx-xx.");
    }
    this.cpf = cpf;

    if (salarioMensal < 0) {
      throw new IllegalArgumentException("Salário menor que zero.");
    }
    this.salarioMensal = salarioMensal;
  }

  private boolean cpfIsInvalid(String cpf) {
    return !Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}").matcher(cpf).matches();
  }

  public String getNome() {
    return this.nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public double getSalarioMensal() {
    return this.salarioMensal;
  }

  public double getSalarioAnual(){
    return 13.0d*getSalarioMensal();
  }

  public Empregado aumento(double acrescimo){
    if (acrescimo < 0) {
      throw new IllegalArgumentException("O valor de acrescimo não pode ser negativo.");
    }
    return new Empregado(nome, cpf, salarioMensal *(1+acrescimo/100.0d));
  }
}
