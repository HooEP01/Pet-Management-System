public class Pet {
    // instance variable
    private String name;

    // constructor
    public Pet(String name){
        this.name = name;
    }

    // accessor method
    public String getName(){
        return name;
    }

    // mutator method
    public void setName(String petName){
        name = petName;
    }

    // speak method
    public String speak(){
        return "I'm your cuddly little pet";
    }

    // to string method
    public String toString(){
        return String.format("%-15s: " + this.getName() + "%n", "name");
    }
}
