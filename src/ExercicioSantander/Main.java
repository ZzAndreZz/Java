package ExercicioSantander;

public class Main {

    public static void main(String[] args) {

        Clientes cliente01 = new Clientes(02,"André",333333333,455555555);

        ContaSanta conta01 = new ContaSanta(cliente01,100);
        ContaPoupanca conta01p = new ContaPoupanca(cliente01,100,0.005);



        conta01p.depositar(10);
        conta01p.sacar(5);
        conta01p.recolherJuros();



    }
}
