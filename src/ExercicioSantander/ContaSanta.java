package ExercicioSantander;

public class ContaSanta {

    private Clientes cliente;
    private double saldo;
    private double valor;
    public ContaSanta(){};

    public ContaSanta(Clientes cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;

    }

    public void sacar(double valor){
        if(saldo>=valor){
            this.saldo = saldo - valor;
            System.out.println("Seu saldo após o saque é: " +saldo);
        }
        else{
            System.out.println("Seu saldo é insuficiente");
        }
    }

    public void depositar(double valor){

        if(valor > 0){
            this.saldo = saldo + valor;
            System.out.println("Depósito efetuado com sucesso");
        }

        else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

