
package com.sofkau;

/**
 *Representa una clase animal con sus respectivos atributos.
 * @author William Andres Monroy Neira.
 */
public class Animal {
    /**
     * Representa los atributos de un animal
     */
    private String name;
    private String type;
    private double weigth;
    private double heigth;
    private int numberOfLegs;
    private String color;

    /**
     * Crea una instancia de la clase animal
     */
    public Animal() {
    }

    /**
     * Crea una instancia de la clase animal con sus principales atributos
     * @param name Atrbuto Nombre
     * @param type Atributo Tipo
     * @param weigth Atributo Peso
     * @param heigth Atributo Altura
     * @param numberOfLegs Atributo Numero de Patas
     * @param color  Atributos Color
     */
    public Animal(String name, String type, double weigth, double heigth, int numberOfLegs, String color) {
        this.name = name;
        this.type = type;
        this.weigth = weigth;
        this.heigth = heigth;
        this.numberOfLegs = numberOfLegs;
        this.color = color;
    }
    /**
     * Encapsulación de los atributos .
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
    
}
