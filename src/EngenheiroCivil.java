public class EngenheiroCivil extends Funcionario {

    public boolean Crea;
    public double salarioEngenheiro = 6500;


    public String costruir(){
        return"Ele construiu um belo prédio";

    }

    public double calcularSalario(double valorHora, double vhoraEx){
        return salario = valorHora * vhoraEx + salarioEngenheiro;
    }

}
