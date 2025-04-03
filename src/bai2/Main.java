package bai2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.createAnimal("dog");
        animal1.speak();

        Animal animal2 = AnimalFactory.createAnimal("cat");
        animal2.speak();
    }
}
