package bogdan;

public class Jellybean extends BaseCandy{
    public int size;

    public Jellybean(String name, double weight, double price, int size) {
        super(name, weight, price);
        this.size = size;
    }

    public Jellybean() {
        super();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String PrintInfo() {
        return "Jellybean [" + super.PrintInfo() + " size: " + size + "]";
    }
}
