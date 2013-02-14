/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author scottodya
 */
public class Receipt {

    private double total;
    private double tax;
    private double tip;
    private double preTotal;
    //MenuItems menuItem;
    //FakeDatabase fdb = new FakeDatabase();
    //CalculatorService cs;

    public Receipt() {
    }

    public void setOrderItemPrices(String[] aItemName) {
        preTotal = 0;
        FakeDatabase fdb = new FakeDatabase();
        //menuItem = new MenuItems();
        for (String itemOrdered : aItemName) {
            for (MenuItems mi : fdb.getMenuItems()) {
                if (itemOrdered.equals(mi.getItemName())) {
                    preTotal = preTotal + mi.getItemPrice();
                }
            }
        }
        //this.preTotal = preTotal;

        ITaxCalculatorService iTax = new CalculatorService();
        ITipCalculatorService iTip = new CalculatorService();
        ITotalCalculatorService iTotal = new CalculatorService();

        iTax.setCalculatedTax(preTotal);
        this.tax = iTax.getCalculatedTax();
        
        iTip.setCalculatedTip(preTotal, tax);
        this.tip = iTip.getCalculatedTip();
        
        iTotal.setCalculatedTotal(preTotal, tax, tip);
        this.total = iTotal.getCalculatedTotal();
        
//        this.tax = iTax.getCalculatedTax();
//        this.tip = iTip.getCalculatedTip();
//        this.total = iTotal.getCalculatedTotal();

    }

    public double getTotal() {
        return total;
    }

    public double getTax() {
        return tax;
    }

    public double getTip() {
        return tip;
    }
}
