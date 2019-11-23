package Model;

public class Cachorro extends Animal implements AnimalMagico {


    public Cachorro(double x, double y,String nome) {
        super(x, y,nome);
    }



    public Cachorro() {
    }





    @Override
    public void Desenhar() {
        System.out.println("Desenhou um Cachorro");
    }

    @Override
    public void falar(String frase) {
    }

    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                ", nome='" + nome + '\'' +
                '}';
    }
}
