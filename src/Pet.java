public class Pet {
    private String name;
    public Pet(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String petName){
        name = petName;
    }
    public String speak(){
        return "I'm your cuddly little pet";
    }
    public String toString(){
        return String.format("%-15s: " + this.getName() + "%n", "name");
    }
}
