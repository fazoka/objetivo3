package Model;

public abstract class Animal {
    protected double x;
    protected double y;
    protected String nome;

    public Animal(double x, double y, String nome) {
        this.x = x;
        this.y = y;
        this.nome = nome;
    }

    public Animal(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void Mover(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract void Desenhar();

    @Override
    public String toString() {
        return "Animal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
