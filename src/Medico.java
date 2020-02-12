public class Medico extends Funcionario {

    public int Crm;
    public double salarioMedico = 5100;

    public String cuidarPessoas(){
        return "Ele cuida bem das pessoas";
    }

    public double calcularSalario(double valorHora, double vhoraEx){
        return salario = valorHora * vhoraEx + salarioMedico;
    }
}
