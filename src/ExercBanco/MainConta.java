package ExercBanco;

public class MainConta {
    public static void main(String[] args){

         // Cachorro cachorro1 = new Cachorro("Golden",5);
         // cachorro1.("Labrador");

         //Cachorro cachorro2 = new Cachorro("Pastor",8);
         //cachorro2.setRaca("BullDog");

        // Baleia baleia1 = new Baleia();
        // baleia1.setCor("Preta");

        // Baleia baleia2 = new Baleia();
        // baleia2.setCor("Branca");

         //Onca onca1 = new Onca();
         //onca1.setTemPinta(false);

         //Onca onca2 = new Onca();
        // onca2.setTemPinta(true);

        //System.out.println();
        //System.out.println("A raça do primeiro cachorro é " + cachorro1.getRaca());
       // System.out.println();
       // System.out.println("A raça do segundo cachorro é " + cachorro2.getRaca());
       // System.out.println();
       // System.out.println("A cor da primeira baleia é " + baleia1.getCor());
       // System.out.println();
       // System.out.println("A cor da segunda baleia é " + baleia2.getCor());
        //System.out.println();
       // System.out.println("A primeira onca não tem pinta, ou seja " + onca1.gettemPinta());
       // System.out.println();
       // System.out.println("A segunda onca tem pinta , ou seja "+ onca2.gettemPinta());



        // System.out.println("O Toto " + Toto.comer());
       // System.out.println("O Zacarias " + Zacarias.comer());
       // System.out.println("O Didi " + Didi.comer());

       // EngenheiroCivil Ronaldo = new EngenheiroCivil();
       // Ronaldo.salario = Ronaldo.calcularSalario(90,6);
       // System.out.println("O salário de Ronaldo é R$ " + Ronaldo.salario);

        //Medico José = new Medico();
        //José.salario = José.calcularSalario(80,9);
        //System.out.println("O salário de José é R$ " + José.salario);

        //Farmaceutico Didi = new Farmaceutico();
        //Didi.salario = Didi.calcularSalario(50,2);
        //System.out.println("O salário de Didi é R$ " + Didi.salario);


       ClienteFisico cliente01 = new ClienteFisico("André","488.795.398-07");
       ClienteFisico cliente02 = new ClienteFisico("Salim","787.864.785-08");

       Conta conta01 = new Conta(cliente01,0.0);

       conta01.depositar(320);
        conta01.sacar(200);

    }
}
