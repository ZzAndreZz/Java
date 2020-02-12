package ExercBanco;

public class Conta{

    private ClienteFisico cliente;
    private double saldo;
    private double valor;
    public Conta(){}

    public Conta(ClienteFisico cliente, double saldo){
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void sacar(double valor){

        if(saldo>=valor){
            this.saldo-=valor;
            System.out.println("Seu saldo é: " + saldo);
        }

        else {
            System.out.println("Seu saldo é insuficiente");
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito efetuado com sucesso");
        }else{
            System.out.println("Valor inválido para Deposito");
        }
    }

    public ClienteFisico getCliente() {
        return cliente;
    }

    public void setCliente(ClienteFisico cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
