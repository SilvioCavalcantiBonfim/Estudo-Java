public class FaturaTeste {
    public static void main(String[] args) throws Exception {
        Fatura fatura = new Fatura("p123", "este é o produto 1", 12, 10.0d);

        System.out.printf("\nO valor total do produto %s é R$: %.2f.\n", fatura.getNumeroProduto(), fatura.getValorTotal());

        try {
            new Fatura("p321", "este é o produto 1", -1, 10.0d);
        } catch (IllegalArgumentException e) {
            System.out.println("\nSucesso: "+e.getMessage());
        }

        try {
            new Fatura("produto 2", "este é o produto 1", 12, -10.0d);
        } catch (IllegalArgumentException e) {
            System.out.println("\nSucesso: "+e.getMessage());
        }

    }
}
