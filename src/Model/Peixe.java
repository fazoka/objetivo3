package Model;

public class Peixe extends Animal {
    private double z;

    public Peixe(){ super(); }

    public Peixe(double x, double y, double z,String nome) {
        super(x, y,nome);
        this.z = z;

    }

    public Peixe(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void mover(double x, double y){
        this.y = y;
        this.x = x;
    }

    public void mover3D(double x, double z, double y){
        this.z = z;
        this.x = x;
        this.y = y;
    }

    @Override
    public void Desenhar() {
        System.out.println("Desenhou um Peixe");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                ", nome='" + nome + '\'' +
                '}';
    }
}
