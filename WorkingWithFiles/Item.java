package WorkingWithFiles;

public class Item {
    public String name;
    public double price;
    public int amount;

    public Item(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double totalValue(){
        return this.price * this.amount;
    }
}
