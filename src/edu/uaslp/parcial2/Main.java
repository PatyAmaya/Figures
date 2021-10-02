package edu.uaslp.parcial2;

import edu.uaslp.parcial2.figures.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Square cuadrado = new Square();
        Rectangle rectangulo = new Rectangle();
        Triangle triangulo = new Triangle();
        RegularPolygon poligonoRegular = new RegularPolygon(5);
        Circle circulo = new Circle();

        List<Figure> figureList = new LinkedList<>();

        figureList.add(cuadrado);
        figureList.add(rectangulo);
        figureList.add(triangulo);
        figureList.add(poligonoRegular);
        figureList.add(circulo);

        printItems2(figureList);

    }

    public static void printItems(List items){
        for(Object item: items){
            if(item instanceof Square){
                ((Square)item).draw();
            }else if(item instanceof Rectangle){
                ((Rectangle)item).draw();
            }else if(item instanceof Triangle) {
                ((Triangle) item).draw();
            }else if(item instanceof RegularPolygon) {
                ((RegularPolygon) item).draw();
            }else if(item instanceof Circle) {
                ((Circle) item).draw();
            }
        }
    }

    //POLIMORFISMO
    public static void printItems2(List<Figure> items){
        for(Figure item: items){
            System.out.println("-----"+item.getName()+ "-----");
            item.draw();
        }
    }

}
