package Class.Inheritance;


class Animal {
    String name;
    public void eat() {
        System.out.println(name + "eat");
    }
    Animal(){}
   Animal(String n){name=n;}

}

class Dog extends Animal {
    public void bark(){
        System.out.println(name + "barks");
    }

    Dog(){}
    Dog(String n){
        super(n);
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println(name+ "meow");
    }
}

    
class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Rocky";
        a.eat();

        Dog d1 = new Dog("Tuffy");
        d1.eat();
        d1.bark();

        Cat c = new Cat();
        c.name="Mew";
        c.eat();
        c.meow();
    }
}
