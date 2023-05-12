public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        System.out.println("a is equal to b? -> " + (a == b));
        System.out.println("a is diferent to b? -> " + (a != b));

        // Relational operators
        System.out.println("a is mayor to b? -> " + (a > b));
        System.out.println("a is menor to b? -> " + (a < b));

        if (a == b) {
            System.out.println("a is equal to b");
        }else {
            System.out.println("a is diferent to b");
        }
    }
}
