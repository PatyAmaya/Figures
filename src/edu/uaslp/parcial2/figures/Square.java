package edu.uaslp.parcial2.figures;

public class Square extends Figure implements FigureWithSides {

    public Square(){
        super("Square");
    }

    public void draw(){
        System.out.println("Cuadrado, tengo 4 lados iguales");
    }


    public int getSidesCount() {
        return 4;
    }
}
