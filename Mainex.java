class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Cat extends Animal {
    
    void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Woof");
    }
}

public class Mainex {
    public static void main(String[] args) {
       // Animal animal = new Animal();
        Cat cat = new Animal();
        Dog dog = new Dog();

        animal.makeSound(); // Output: Animal is making a sound
        cat.makeSound();    // Output: Meow
        dog.makeSound();    // Output: Woof
    }
}
