public class Farmaceutico extends Funcionario {

    public int Crf;
    public double salarioFarmaceutico = 3100;


    public String atender(){
        return "Ele atende bem as pessoas";
    }

    public double calcularSalario(double valorHora, double vhoraEx){
        return salario = valorHora * vhoraEx + salarioFarmaceutico;
    }
}
