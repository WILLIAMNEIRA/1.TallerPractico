
package com.sofkau;

/**
 * Representa una clase llamada Cuenta Bancaria con sus respectivos atributos.
 * @author William Andres Monroy Neira.
 */

public class BankAccount {
    /**
     * Representa los atributos de una cuenta bancaria.
     */
     private int accountNumber;
     protected boolean activated;
     private Double balance;

     /**
      * Crea una instancia de la clase Cuenta Bancaria
      */
    public BankAccount() {
    }
    /**
     * Crea una instacia de la clase Cuenta Bancaria con sus respectivos atributos.
     * @param accountNumber
     * @param activated
     * @param balance 
     */
    public BankAccount(int accountNumber, boolean activated, Double balance) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.balance = balance;
    }
    /**
     *Encapsulación de los atributos.
     */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
   
    
}
