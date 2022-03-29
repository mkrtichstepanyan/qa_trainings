package javaClasses.overloading;

import static javaClasses.overloading.VarargAmbiguos.enumeration;

public class SimpleOverloading {


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return sum(num1 + num2, num3);
    }

    public static double sum(Cube cube1, Cube cube2) {
        return cube1.getVolume() + cube2.getVolume();
    }

    public static float sum(float num1, float num2) {
        return num1 + num2;
    }

    // args.length >= 0
    public static int sum(int... args) {
        int initial = 0;
        for (int value : args) {
            initial = +value;
        }
        return initial;
    }

    Shape shape1 = new Cube(3);

    Shape shape2 = new Sphere(3);




//    public static double sum(Shape shape1, Shape shape2) {
//        return shape1.getVolume() + shape2.getVolume();
//    }

//    public static double sum(Shape... shapes) {
//        double initialVolume = 0;
//        for (Shape singleItem :
//                shapes) {
//            initialVolume = +singleItem.getVolume();
//        }
//        return initialVolume;
//    }


    public static void main(String[] args) {
//        int firstInt = 10;
//        int secondInt = 15;
//        int thirdInt = 13;
//
//        System.out.println("Sum fot int: " + sum(firstInt, secondInt, thirdInt));
//
//        float firstFloat = 10.5f;
//
//        float secondFloat = 12.3f;
//
//        System.out.println(sum(firstFloat, secondFloat));
//
        Cube firstCube = new Cube(3);

        firstCube.setSide(-90);
//
        Cube secondCube = new Cube();

        secondCube.setSide(8);


        Shape shape1 = new Cube(3);

        Shape shape2 = new Sphere(4);

        shape1.getSurface();

        shape2.getSurface();




//        System.out.println(firstCube.getVolume());
//        System.out.println(secondCube.getVolume());

//        System.out.println(sum(firstCube, secondCube));

//        System.out.println(sum(firstCube, secondCube));

    }


}
