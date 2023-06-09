public class Functions {
    public static void main(String[] args) {
        int area = 5;
        double dimens = circleArea(area);
        System.out.println(dimens);

        double sphere = sphereArea(area);
        System.out.println(sphere);
        System.out.println("This code is unreachable");
        System.out.println("This code is unreachable");

        System.out.println(convertToDollar(1000, "MXN"));
    }
    public static double circleArea(double radio) {
       return Math.PI * Math.pow(radio, 2);
    }

    public static double sphereArea(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);

    }

    /**
     * Description: This function converts a quantity of money to dollars
     *
     * @param quantity quantity of money
     * @param currency currency type: MXN or COP
     * @return quantity of money converted to dollars
     * */
    public static double convertToDollar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
