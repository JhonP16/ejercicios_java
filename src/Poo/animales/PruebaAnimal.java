package Poo.animales;

import java.util.ArrayList;

public class PruebaAnimal {

    // Metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Objeto Clase padre
        System.out.println("---- Imprimir cada método del polimorfismo por cada instancia: ----");
        Animal perro1 = new Perro(); // Puedo referenciar la clase Padre, pero debo instanciar desde la clase hija.
        perro1.hacerSonido();
        Animal gato1 = new Gato();
        gato1.hacerSonido();

        System.out.println("---- Imprimir con el metodo polimorfico: ----");

        imprimirSonido(perro1);
        imprimirSonido(gato1);

        System.out.println("---- Guardar en un Arraylist e imprimir: ----");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(perro1);
        animals.add(gato1);

        for (Animal animal : animals){
            animal.hacerSonido();
        }

    }
}
