class Parent {
    private int privateNumber = 100; 

    public int getPrivateNumber() {
        return privateNumber; 
    }
}

class Child extends Parent {
    public void display() {
     
        System.out.println("Private member cannot be accessed directly.");
        System.out.println("Accessing private member using getter: " + getPrivateNumber());
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

