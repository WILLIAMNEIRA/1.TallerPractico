
package com.sofkau;
/**
 *Representa una clase plato de comida y sus respectivos atributos
 * @author William Andres Monroy Neira
 */

import java.util.ArrayList;
/**
 * Importamos el paquete (ArrayList).
 * Estamos trabajando con un atributo de tipo Lista.
 * 
 */

public class Dish {
    /**
     * Representa los atributos de la clase Plato
     */
    private String portion;
    private double price;
    private double amount;
    private ArrayList<String> ingredients;
     /**
     *Crea una instancia de la clase Persona.
     **/
    public Dish() {
    }
    
    /**
     * Crea una instancia de la clase Plato con sus respectivos atributos
     * @param portion Atributo Porcion
     * @param price Atributo Precio
     * @param amount Atributo Cantidad
     * @param ingredients  Atributo Ingredientes
     */
    public Dish(String portion, double price, double amount, ArrayList<String> ingredients) {
        this.portion = portion;
        this.price = price;
        this.amount = amount;
        this.ingredients = ingredients;
    }
    /**
     * Encapsulación de los Atributos. 
     */
     public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    
}
