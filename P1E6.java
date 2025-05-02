class TaxCalculator {
    // Final variable for GST rate
    final double GST_RATE = 18.0;


    final void displayGST() {
        System.out.println("GST Rate: " + GST_RATE + "%");
    }
}

class Invoice extends TaxCalculator {
    
    double calculateTotalWithTax(double amount) {
        return amount + (amount * GST_RATE / 100);
    }
}

public class P1E6 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.displayGST();

        double amount = 1000.0;
        double total = invoice.calculateTotalWithTax(amount);
        System.out.println("Total amount with GST: " + total);
    }
}