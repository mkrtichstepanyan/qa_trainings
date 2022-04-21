package javaClasses.overloading;

public class Sphere extends Shape {

    private int radius;

     Sphere(int radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public double getSurface() {
        System.out.println("Getting surface for sphere");
        return super.getSurface();
    }

    public int getRadius() {
         return radius;
    }
}
