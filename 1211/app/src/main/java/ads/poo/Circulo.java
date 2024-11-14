package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Circulo {
    private double x;
    private double y;
    private double radius;
    private Color color;

    public Circulo(double x, double y, double radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void desenhar(Draw draw) {
        draw.setPenColor();
        draw.circle(this.x, this.y, this.radius);
    }
}
