/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scottodya
 */
public interface ITotalCalculatorService {
    public abstract void setCalculatedTotal(double retailPrice, double tax, double tip);
    public abstract double getCalculatedTotal();
}
