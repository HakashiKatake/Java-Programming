package Class;

class Animal2 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("barking...");
    }
}


public class InheriEx2 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.bark();
        d.eat();
    }
}
