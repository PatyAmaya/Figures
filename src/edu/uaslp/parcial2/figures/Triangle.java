package edu.uaslp.parcial2.figures;

public class Triangle extends Figure implements FigureWithSides{

    public Triangle(){
        super("Triangle");
    }

    public void draw() {
        System.out.println("Triángulo, tengo 3 lados");
    }

    public int getSidesCount() {
        return 3;
    }
}