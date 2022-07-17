public class Cat extends Pet{
    // instance variable
    private String coatColor;

    // constructor
    public Cat(String name, String coatColor){
        super(name);
        this.coatColor = coatColor;
    }

    // accessor method
    public String getCoatColor(){
        return coatColor;
    }

    // mutator method
    public void setCoatColor(String coatColor){
        this.coatColor = coatColor;
    }

    // speak method
    public String speak() {
        return "Don't give me order.\nI speak only when i want to.";
    }

    // to string method
    public String toString(){
        return super.toString() + String.format("%-15s: " + this.getCoatColor() + "%n", "coat color");
    }
}
