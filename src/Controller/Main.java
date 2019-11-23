package Controller;

import Model.*;

import javax.xml.xpath.XPathExpressionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe(9, 2, 4,"joão");
        Peixe peixe2 = new Peixe(8, 3, 5, "danilo");
        Peixe peixe3 = new Peixe(7, 1, 6, "roberto");
        System.out.println("\n********** Peixes:" + peixe1 + peixe2 + peixe3 );

        Cachorro cachorro1 = new Cachorro(4, 5, "João");
        Cachorro cachorro2 = new Cachorro(5,6, "Junior");
        Cachorro cachorro3 = new Cachorro(6,7, "Juan");
        System.out.println("\n********** Cachorros:" + cachorro1 +  cachorro2 + cachorro3);

        Passaro passaro1 = new Passaro(1,2 ,"Pedro");
        Passaro passaro2 = new Passaro(2,3, "Mauricio");
        Passaro passaro3 = new Passaro(3,4, "Ricardo");
        System.out.println("\n********** Passaros:" + passaro1 + passaro2 + passaro3);

        List<Animal> animals= new ArrayList<>();
        animals.add(peixe1);
        animals.add(peixe2);
        animals.add(peixe3);
        animals.add(cachorro1);
        animals.add(cachorro2);
        animals.add(cachorro3);
        animals.add(passaro1);
        animals.add(passaro2);
        animals.add(passaro3);
        System.out.println("\n********** Animais :\n" + animals);

        List<AnimalMagico> animalMagicos = new ArrayList<>();
        animalMagicos.add(cachorro1);
        animalMagicos.add(cachorro2);
        animalMagicos.add(cachorro3);
        animalMagicos.add(passaro1);
        animalMagicos.add(passaro2);
        animalMagicos.add(passaro3);
        System.out.println("\n********** Animais que falam :\n" + animalMagicos);

        peixe1.mover(5,5);
        peixe2.mover(5,5);
        peixe3.mover(5,5);
        peixe1.Desenhar();
        peixe2.Desenhar();
        peixe3.Desenhar();

        cachorro1.mover(5,5);
        cachorro2.mover(5,5);
        cachorro3.mover(5,5);
        cachorro1.Desenhar();
        cachorro2.Desenhar();
        cachorro3.Desenhar();

        passaro1.mover(5,5);
        passaro2.mover(5,5);
        passaro3.mover(5,5);
        passaro1.Desenhar();
        passaro2.Desenhar();
        passaro3.Desenhar();

        System.out.println("\n********** Animais :\n" + animals);

        peixe1.mover3D(8,8,8);
        peixe2.mover3D(8,8,8);
        peixe3.mover3D(8,8,8);
        System.out.println("\n********** Peixes:" + peixe1 + peixe2 + peixe3 );

        animals.sort(Comparator.comparingDouble(Animal::getX).reversed());
        System.out.println("\n********** Lista de animais em ordem descrecente X:\n" + animals);

    }
}
