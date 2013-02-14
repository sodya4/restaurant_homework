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
        ITotalCalculatorService, ITipCalculatorService, ITaxCalculatorService {

    private double TAX_RATE = 0.07;
    private double TIP_RATE = 0.15;
    private double tax;
    private double tip;
    private double total;

    public double getTotal() {
        return total;
    }

    public double getTip() {
        return tip;
    }
    
    public double getTax() {
        return tax;
    }
    
    @Override
    public void setCalculatedTotal(double preTotal) {
        this.total = (preTotal + getTax() + getTip());
    }
    
    @Override
    public double getCalculatedTotal(){
        return total;
    }

    @Override
    public void setCalculatedTip(double preTotal) {
        this.tip = (TIP_RATE * (preTotal + getCalculatedTax()));
    }
    
    @Override
    public double getCalculatedTip(){
        return tip;
    }

    @Override
    public void setCalculatedTax(double preTotal) {
        this.tax = (TAX_RATE * preTotal);
    }
    
    @Override
    public double getCalculatedTax(){
        return tax;
    }
}
