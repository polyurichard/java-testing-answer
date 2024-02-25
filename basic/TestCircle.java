class Circle{
    private int radius;

    public void draw() {
        System.out.println("I am drawing a Circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class TestCircle {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.draw();
      } 
}