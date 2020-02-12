package ExercicioSantander;

public class Clientes {

    private int numCliente;
    private String nome;
    private int RG;
    private int CPF;

    public Clientes(int numCliente, String nome, int RG, int CPF){
        this.numCliente = numCliente;
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
}

