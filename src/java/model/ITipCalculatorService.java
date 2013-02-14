/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scottodya
 */
public interface ITipCalculatorService {
    public abstract void setCalculatedTip(double retailPrice);
    public abstract double getCalculatedTip();
}
