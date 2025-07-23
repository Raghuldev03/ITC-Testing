package assignment;
public class RealEstate {
    public static void main(String[] args) {
        int area = 1500; // in square feet
        int pricePerSqFt = 5000; // INR
        double registrationTax = 0.08; // 8%
        double gst = 0.03; // 3%

        double basePrice = area * pricePerSqFt;
        double registrationAmount = basePrice * registrationTax;
        double gstAmount = basePrice * gst;
        double totalPrice = basePrice + registrationAmount + gstAmount;

        System.out.println("Real Estate Price Calculation:");
        System.out.println("Base Price (1500 sqft * 5000): ₹" + basePrice);
        System.out.println("Registration Charges (8%): ₹" + registrationAmount);
        System.out.println("GST (3%): ₹" + gstAmount);
        System.out.println("Total Payable Amount: ₹" + totalPrice);
    }
}
