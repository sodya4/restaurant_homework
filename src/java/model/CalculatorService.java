/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scottodya
 */
public class CalculatorService implements 
        ITotalCalculatorService, ITipCalculatorService, ITaxCalculatorService{
    private double TAX_RATE = 0.07;
    private double TIP_RATE = 0.15;
    private double tax;

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }
    private double tip;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    @Override
    public double calculateTotal(double retailPrice) {
        double value;
        value = retailPrice + getTax() + getTip();
        return value;
    }

    @Override
    public double calculateTip(double retailPrice) {
        double value;
        setTip(TIP_RATE * (retailPrice + calculateTax(retailPrice)));
        value = getTip();
        return value;
    }

    @Override
    public double calculateTax(double retailPrice) {
        double value;
        setTax(TAX_RATE * retailPrice);
        value = getTax();
        return value;
    }
    
}
