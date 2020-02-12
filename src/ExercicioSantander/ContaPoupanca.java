package ExercicioSantander;

public class ContaPoupanca extends ContaSanta {

    private double taxaJuros;

    public ContaPoupanca(Clientes cliente, double saldo, double taxaJuros) {
        super(cliente, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void recolherJuros() {

        double jurosBancario = this.getSaldo() * taxaJuros;
        this.setSaldo(this.getSaldo() + jurosBancario);
        System.out.println("O valor do juros é R$ " + jurosBancario);
        System.out.println("O saldo atualizado é R$ " + getSaldo());

    }
}
