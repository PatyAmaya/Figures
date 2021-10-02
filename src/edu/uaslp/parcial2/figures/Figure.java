package edu.uaslp.parcial2.figures;

public abstract class Figure {
    private String name;

    Figure(String name){
        this.name=name;
    }

    public String getName(){ //Método concreto
        return name;
    }

    public abstract void draw(); //Método abstracto
}
