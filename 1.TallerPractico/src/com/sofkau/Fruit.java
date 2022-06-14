
package com.sofkau;
/**
 * Representa una clase Frutas y sus respectivos atributos.
 * @author William Andres Monroy Neira.
 */
import java.util.ArrayList;
/**
 * Importamos el paquete (ArrayList) ya que estamos trabajando con un atributo de tipo Lista.
 * 
 */

public class Fruit {
    /**
     * Representa los atributos de una fruta.
     */
    public String name;
    public String form;
    public double size;
    private float averageWeigth;
    public ArrayList<String> colors;

    /**
     * Crea una instancia de la clase fruta.
     */
    public Fruit() {
    }
    /**
     * Crea una instancia con todos los atributos de la clase Fruta.
     * @param name Atributo nombre.
     * @param form Atributo Forma
     * @param size Atributo Tamaño
     * @param averageWeigth Atributo Peso Promedio.
     * @param colors Atributo Color
     */
    public Fruit(String name, String form, double size, float averageWeigth, ArrayList<String> colors) {
        this.name = name;
        this.form = form;
        this.size = size;
        this.averageWeigth = averageWeigth;
        this.colors = colors;
    }
    /**
     * Encapsulación de los Atributos.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public float getAverageWeigth() {
        return averageWeigth;
    }

    public void setAverageWeigth(float averageWeigth) {
        this.averageWeigth = averageWeigth;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
    
}
