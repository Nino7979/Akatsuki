
public class Circle {
    private String color;
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }
    public String toString(){
        return this.color + this.radius;
    }
}
