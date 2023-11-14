import java.util.Scanner;

import Calc.Calc;

public class App {
    public static void main(String[] args) throws Exception {
        double valor1, valor2, result;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        valor1 = sc.nextDouble();
        System.out.println("Informe o segundo valor:");
        valor2 = sc.nextDouble();
        System.out.println("Informe a operação [+,-,*,/]:");
        operator = sc.next().charAt(0);
        sc.close();

        result = switch(operator){
            case '+' -> Calc.soma(valor1, valor2);
            case '-' -> Calc.subtracao(valor1, valor2);
            case '*' -> Calc.multiplicacao(valor1, valor2);
            case '/' -> Calc.divisao(valor1, valor2);
            default -> throw new IllegalArgumentException("Unexpected value: " + operator);
        };

        System.out.println(String.format("%.2f%c%.2f=%.2f", valor1, operator, valor2, result));

    }
}
