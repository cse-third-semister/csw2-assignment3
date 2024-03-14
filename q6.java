import java.util.UUID;

class Animal {
    private String name;
    private String color;
    private String type; 

   
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }


    @Override
    public int hashCode() {
        String uniqueId = UUID.randomUUID().toString();
        System.out.println("Unique ID for " + name + ": " + uniqueId);
        return uniqueId.hashCode();
    }
}

public class q6 {
    public static void main(String[] args) {
      
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");
        Animal lion = new Animal("Lion", "Yellow", "Wild");

     
        System.out.println("Hash code for Dog: " + dog.hashCode());
        System.out.println("Hash code for Cat: " + cat.hashCode());
        System.out.println("Hash code for Lion: " + lion.hashCode());
    }
}
