package volodyaLesson.overloading;

/**
 * Simple geometrical class extended from abstract Shape
 */

public class Cube extends Shape {

    private int side;


    public Cube(int side) {
        System.out.println("Creating cube with initial size");
        if (side < 0) {
            this.side = -side;
            return;
        }
        this.side = side;
    }

    public Cube() {
        System.out.println("Creating cube without initial size");
    }


    public void setSide(int side) {
        if (side < 0) {
            this.side = -side;
            return;
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }


    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double getSurface() {
        System.out.println("Surface for cube");
        return super.getSurface();
    }
}
