public class Casting {
    public static void main(String[] args) {
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(Math.floor(monthlyDogs));

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);
    }
}
