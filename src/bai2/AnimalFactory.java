package bai2;

public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        throw new IllegalArgumentException("Loại động vật không hợp lệ: " + type);
    }
}
