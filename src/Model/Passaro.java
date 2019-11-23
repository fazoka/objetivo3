package Model;

public class Passaro extends Animal implements AnimalMagico {



    public Passaro(double x, double y, String nome) {
        super(x, y,nome);

    }

    public Passaro() {
    }


    @Override
    public void Desenhar() {
        System.out.println("Desenhou um Passaro");
    }

    @Override
    public void falar(String frase) {
        System.out.println("eu sou um Passaro");
    }

    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "Passaro{" +
                "x=" + x +
                ", y=" + y +
                ", nome='" + nome + '\'' +
                '}';
    }
}
