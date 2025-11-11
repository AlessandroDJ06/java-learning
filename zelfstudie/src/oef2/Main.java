package oef2;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = { new Dog(), new Cat(), new Dog() };
        for (Animal a : zoo) {
            a.makeSound();
        }

    }
}
