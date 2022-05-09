package bogdan;

public class Biscuit extends BaseCandy {
    private String type;

    public Biscuit(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String PrintInfo() {
        return "Biscuit [" + super.PrintInfo() + ", type: " + type + "]";
    }
}
