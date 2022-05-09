package bogdan;

public abstract class BaseCandy {
    public String name;
    public double weight;
    public double price;

    public BaseCandy(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public BaseCandy() {

    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String PrintInfo() {
        return "name: " + name + ", weight: " + weight + ", price: " + price;
    }
}