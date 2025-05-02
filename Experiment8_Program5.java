import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Experiment8_Program5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 22);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
            System.out.println("Person object serialized.");
        } catch (IOException e) {
            System.out.println("Error: Unable to serialize object.");
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Person object deserialized:");
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: Unable to deserialize object.");
        }
    }
}
