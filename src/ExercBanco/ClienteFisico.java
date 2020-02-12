package ExercBanco;

public class ClienteFisico {

    private String nome;
        private String CPF;

        public ClienteFisico(String nome, String cpf){
            this.nome = nome;
            this.CPF = cpf;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
