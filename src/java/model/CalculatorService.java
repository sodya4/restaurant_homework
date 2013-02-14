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
    public void setCalculatedTotal(double preTotal, double tax, double tip) {
        this.total = preTotal + tax + tip;
    }
    
    @Override
    public double getCalculatedTotal(){
        return total;
    }

    @Override
    public void setCalculatedTip(double preTotal, double tax) {
        this.tip = (TIP_RATE * (preTotal + tax));
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
