import java.util.List;

import figura.Circulo;
import figura.Figura;
import figura.Retangulo;
import figura.Triangulo;

public class AppFigura {
    public static void main(String[] args) throws Exception {
        List<Figura> figuras = List.of(
            new Retangulo(1, 1, "azul"),
            new Retangulo(1, 1, "verde"),
            new Triangulo(1, 2, "vermelho"),
            new Triangulo(2, 2, "rosa"),
            new Circulo(2, "preto"),
            new Circulo(3, "branco")
        );

        figuras.forEach(
            e -> {
                System.out.println(e.toString());
                System.out.printf("com área %.2f\n", e.area());
                if (e instanceof Circulo) {
                    Circulo c = (Circulo) e;
                    System.out.printf("com diametro %.2f\n", c.getDiametro());
                }
                System.out.println();
            }
        );
    }
}
