public class forLoop {
    static boolean statusLight = false;

    public static void main(String[] args) {
        toggleStatusLight();
        printSOS();
    }

    /**
     * Description: This method will toggle the status of the light
     *
     * @param: none
     * @return: none
     * @throws: none
     * @see: none
     **/
    public static void toggleStatusLight() {
        statusLight = !statusLight;
    }

    public static void printSOS() {
        for (int i = 0; i <= 10; i++) {
            if (statusLight) {
                System.out.println("___||__");
            }
        }
    }
}
