public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 350.50;
        double salesTax = 0 ;
        final double SALES_TAX_RATE = 0.5;  //use final to make it a constant

        salesTax = purchasePrice * SALES_TAX_RATE;

        System.out.println("The sales tax on a purchase of " + purchasePrice + " is $" + salesTax);
    }
}