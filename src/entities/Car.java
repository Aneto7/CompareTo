package entities;

public class Car implements Comparable<Car> {

    private String brand;
    private Double topspeed;

    public Car(String brand, Double topspeed) {
        this.brand = brand;
        this.topspeed = topspeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(Double topspeed) {
        this.topspeed = topspeed;
    }

    @Override
    public int compareTo(Car other) {
        return brand.compareTo(other.getBrand());
    }
}
