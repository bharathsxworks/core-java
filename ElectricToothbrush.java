class ElectricToothbrush {
    static String brandName = "Oral-B";
    static int price = 129;
    static String[] modes = {"Daily Clean", "Gum Care"};
    static int timerMinutes = 2;
    static int batteryLifeDays = 10;

    public static void main(String[] args) {
        System.out.println("Brand: " + brandName);
        System.out.println("Price: $" + price);
        System.out.print("Modes: ");
        for (int i = 0; i < modes.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
           
