package edu.uaslp.parcial2.figures;

public class RegularPolygon extends Figure implements FigureWithSides {
    private int sides;

    public RegularPolygon(int sides){
        super("RegularPolygon");

        this.sides=sides;
    }

    @Override
    public void draw() {
        System.out.println("Poligono Regular, tengo "+sides+" lados iguales");
    }

    @Override
    public int getSidesCount() {
        return sides;
    }
}
