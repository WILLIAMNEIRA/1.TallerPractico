package com.sofkau;
/**
 * Representa una clase persona y sus respectivos atributos.
 * @author William Andres Monroy Neira
 */

import java.util.Date;
/**
 * Importamos el paquete de (date) ya que estamos trabajando con un atributo de tipo fecha.
 */

public class Person {
    /**
     * Representa los atributos  de una Persona.
     */
    public String name;
    public String lastName2;
    public String lastName1;
    public String identificationDocument;
    public Date dateBirth;
    public float height;
    public int phone;

    /**
     *Crea una instancia de la clase Persona.
     **/
    public Person() {
    }

    /**Crea una instancia de la clase Persona con sus principales atributos.
     * @param name Atributo Nombre.
     * @param lastName1 Atributo Primer Apellido.
     * @param lastName2 Atributo Segundo Apellido.
     * @param identificationDocument Atributo Numero de Identificación.
     */
    public Person(String name, String lastName1, String lastName2, String identificationDocument) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.identificationDocument = identificationDocument;
    }
    /**
     * Crea una instancia de la clase Persona con todos sus atributos.
     * @param name Atributo Nombre.
     * @param lastName1 Atributo Primer Apellido.
     * @param lastName2 Atributo Segundo Apellido
     * @param identificationDocument Atribvuto Numero de Identificación.
     * @param phone Atributo Telefono.
     * @param dateBirth Atributo Fecha de Nacimiento.
     * @param height Atributo Altura.
     */
    public Person(String name, String lastName1,String lastName2, String identificationDocument, int phone, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.identificationDocument = identificationDocument;
        this.phone = phone;
        this.dateBirth = dateBirth;
        this.height = height;
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
    
    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

}
