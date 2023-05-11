public class DataTypes {
    public static void main(String[] args) {
        int number = 105446;

        long bigNumber = 123333333333334L;
        double decimalNumber = 321.45469846946947;
        float decimalNumber2 = 3.2F;

        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Juan Salgado";
        System.out.println("Employee: " + employeeName + " Salary: " + totalSalary);
    }
}
