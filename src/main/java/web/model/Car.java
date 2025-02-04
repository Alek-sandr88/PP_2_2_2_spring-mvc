package web.model;

public class Car {
    private int series;
    private String model;

    private String color;

    public Car(int series, String model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = this.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
