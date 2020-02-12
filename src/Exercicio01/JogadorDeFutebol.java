package Exercicio01;

public class JogadorDeFutebol {

    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;


    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public void fazerGol(){
        if(this.energia >= 5){
            this.energia -= 5;
            this.alegria += 10;
            this.gols++;

            System.out.println("GOOOOOOL!!!");

        }else {
            System.out.println("Sem energia");
        }
    }

    public void correr(){
        if(this.energia >= 10){
            this.energia -= 10;
            System.out.println("Cansei");
        }else {
            System.out.println("Sem energia");
        }
    }

}