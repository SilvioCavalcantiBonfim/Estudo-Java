public class EmpregadoTeste {
    public static void main(String[] args) throws Exception {
        Empregado empregado1 = new Empregado("teste", "000.000.000-00", 1320.0d);
        Empregado empregado2 = new Empregado("teste1", "000.000.000-00", 1000.0d);

        System.out.printf("\nSalário Anual: R$ %.2f\n",empregado1.getSalarioAnual());
        empregado1 = empregado1.aumento(10);
        System.out.printf("Salário Anual: R$ %.2f\n",empregado1.getSalarioAnual());

        System.out.printf("\nSalário Anual: R$ %.2f\n",empregado2.getSalarioAnual());
        empregado2 = empregado2.aumento(10);
        System.out.printf("Salário Anual: R$ %.2f\n",empregado2.getSalarioAnual());

        try {
            new Empregado("teste", "00.000.000-00", 1320.0d);
        } catch (IllegalArgumentException e) {
            System.out.println("\nSucesso: "+e.getMessage());
        }

        try {
            new Empregado("teste", "000.000.000-00", -1320.0d);
        } catch (IllegalArgumentException e) {
            System.out.println("\nSucesso: "+e.getMessage());
        }

        try {
            Empregado empregadoErrorCPF = new Empregado("teste", "000.000.000-00", 1320.0d);
            empregadoErrorCPF.aumento(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("\nSucesso: "+e.getMessage());
        }

    }
}
