package ru.mirea.lab7;

public class Chair  extends Furniture{
    private String material ;

    public Chair(double price, double weight, double height, String material) {
        super(price, weight, height);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                super.toString() +
                '}';
    }
}
