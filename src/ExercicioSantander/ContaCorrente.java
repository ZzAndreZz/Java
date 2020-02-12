package ExercicioSantander;

public class ContaCorrente extends ContaSanta{

    private double chequeEspecial;
    

    public ContaCorrente(Clientes cliente, double saldo, double chequeEspecial) {
        super(cliente, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public void depositarCheques(){
        this.cheque=cheque;

    }
}
