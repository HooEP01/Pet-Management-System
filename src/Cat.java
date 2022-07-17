public class Cat extends Pet{
    private String coatColor;
    public Cat(String name, String coatColor){
        super(name);
        this.coatColor = coatColor;
    }
    public String getCoatColor(){
        return coatColor;
    }
    public void setCoatColor(String coatColor){
        this.coatColor = coatColor;
    }
    public String speak() {
        return "Don't give me order.\nI speak only when i want to.";
    }
    public String toString(){
        return super.toString() + String.format("%-15s: " + this.getCoatColor() + "%n", "coat color");
    }
}
