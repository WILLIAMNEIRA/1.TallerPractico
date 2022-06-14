package com.sofkau;
/**
 *Representa una clase llamada Carro con sus respectivos atributos
 * @author William Andres Monroy Neira
 */
public class Car {
    /**
     * Representa los atributos de un carro
     */
    public String brand;
    public String model;
    public String color;
    private String tuition;
    private String price;

    /**
     * Crea una instancia de la clase Carro
     */
    public Car() {
    }
    /**
     * Crea una instancia de la clase Carro con sus respectivos atributos
     * @param brand Atributo Marca
     * @param model Atributo Modelo
     * @param color Atributo Color
     * @param tuition Atributo Matricula
     * @param price Atributo Precio
     */

    public Car(String brand, String model, String color, String tuition, String price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.tuition = tuition;
        this.price = price;
    }
    
    /**
     * Encapsulación de los atributos 
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
