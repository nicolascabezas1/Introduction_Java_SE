public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // bonus $200
        salary += 200;
        System.out.println(salary);

        // pension $50 discount
        salary -= 50;
        System.out.println(salary);

        // 2 extra hours $30 c/u
        // lunch $45
        salary += (30*2) - 45;
        System.out.println(salary);

        // Updating text
        String employeeName = "Nicolas Cabezas";
        employeeName += " Perez";
        System.out.println(employeeName);

        employeeName = "Juan " + employeeName;
        System.out.println(employeeName);
    }
}
