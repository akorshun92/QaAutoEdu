package figur;

import java.util.Random;

public class Rectangle extends Figures {

    public double area, a, b, x, y;


    @Override
    public void move(double a, double b) {
        x = x + 10;
        y = y + 20;
    }

    @Override
    public double area(double a, double b) {
        area = a * b;
        return Math.rint(100.0 * area) / 100.0;
    }


    @Override
    public double resize(double a, double b) {
        Random random = new Random();
//        double resize = random.nextInt (100);
//        resize = resize / 100;
        double resize = Math.random();
        a = a * resize;
        b = b * resize;
        area = a * b;
        return Math.rint(100.0 * area) / 100.0;
    }


    @Override
    public void coordinates(double x, double y) {
        x = Math.random()* 300;
        y = Math.random()*300;
    }
}
