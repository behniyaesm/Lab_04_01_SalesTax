public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 350.50;
        double salesTax = 0 ;
        double totalCost = 0 ;
        final double SALES_TAX_RATE = 0.05;  //use final to make it a constant

        salesTax = purchasePrice * SALES_TAX_RATE;
        totalCost = purchasePrice + salesTax;
        System.out.println("The sales tax on a purchase of " + purchasePrice + " is $" + salesTax);
        System.out.println("The total price on a item that costs $" + purchasePrice + " is $" + totalCost + " with sales tax.");
    }
}