package bogdan;

public class Candy extends BaseCandy{
    private String filling;

    public Candy(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String PrintInfo() {
        return "Candy [" + super.PrintInfo() + " filling: " + filling + "]";
    }
}