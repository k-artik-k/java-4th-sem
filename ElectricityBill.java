class ElectricityBill {
    public static void main(String[] args) {
        double units = Double.parseDouble(args[0]);
        double bill = 0;
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        System.out.println("Electricity Bill: Rs. " + totalBill);
    }
}
