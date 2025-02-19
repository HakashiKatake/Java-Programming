
class Parent {
    int value = 100;
}

class Child extends Parent {
    int value = 50;
    
    void display() {
        System.out.println("Child's value: " + value);        
        System.out.println("Parent's value: " + super.value); 
    }
}


public class Super {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}


