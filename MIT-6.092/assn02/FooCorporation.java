public class FooCorporation {
    
    public static void magic(double basePay, int hoursWorked) {
        if (basePay < 8.0) {
            System.err.println("The base pay must be larger than or equal to $8.00 an hour!!!");
            return;
        }
        if (hoursWorked > 60) {
            System.err.println("The hours worked must be less than or equal to 60 hours!!!");
            return;
        }
        double pay = 0.0;
        pay = basePay * hoursWorked + (hoursWorked > 40 ? 0.5 * basePay * (hoursWorked-40):0);
        System.out.printf("The payment is $%.2f.\n", pay);
    } 

    public static void main(String[] args) {
        magic(7.5, 35);
        magic(8.2, 47);
        magic(10, 73);
    }
}
