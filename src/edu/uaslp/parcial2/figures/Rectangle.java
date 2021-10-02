package edu.uaslp.parcial2.figures;

public class Rectangle extends Figure implements FigureWithSides{

    public Rectangle(){
        super("Rectangle");
    }

    public void draw() {
        System.out.println("Rectángulo, tengo 4 lados");
    }

    public int getSidesCount() {
        return 4;
    }
}
