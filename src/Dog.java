public class Dog extends Pet{
    private Double weight;
    public Dog(String name, Double weight){
        super(name);
        this.weight = weight;
    }
    public Double getWeight(){
        return weight;
    }
    public void setWeight(Double weight){
        this.weight = weight;
    }
    public String speak() {
        return "Don't give me order.\nI speak only when i want to.";
    }
    public String toString(){
        return super.toString() + String.format("%-15s: " + this.getWeight() + "%n", "weight");
    }
}
