/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scottodya
 */
public interface ITaxCalculatorService {
    public abstract void setCalculatedTax(double retailPrice);
    public abstract double getCalculatedTax();
}
