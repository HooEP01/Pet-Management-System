public class Dog extends Pet{
    // instance variable
    private Double weight;

    // constructor
    public Dog(String name, Double weight){
        super(name);
        this.weight = weight;
    }

    // accessor method
    public Double getWeight(){
        return weight;
    }

    // mutator method
    public void setWeight(Double weight){
        this.weight = weight;
    }

    // speak method
    public String speak() {
        return "Don't give me order.\nI speak only when i want to.";
    }

    // to string method
    public String toString(){
        return super.toString() + String.format("%-15s: " + this.getWeight() + "%n", "weight");
    }
}
