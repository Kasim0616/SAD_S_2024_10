package SOLID;

public class LSP_02 {

    public static abstract class Bird {

        public abstract void makeSound();
    }

    public static abstract class FlyingBird extends Bird {

        public abstract void fly();
    }

    public static class Sparrow extends FlyingBird {

        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }

        @Override
        public void makeSound() {
            System.out.println("Chirp chirp!");
        }
    }

    public static class Penguin extends Bird {

        @Override
        public void makeSound() {
            System.out.println("Honk honk!");
        }

        public void swim() {
            System.out.println("The penguin is swimming...");
        }
    }

    public static void move(FlyingBird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        move(sparrow);

        Penguin penguin = new Penguin();
        penguin.swim();
