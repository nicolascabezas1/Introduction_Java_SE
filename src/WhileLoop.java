public class WhileLoop {
    static boolean isLightTurn = true;
    public static void main(String[] args) {
        statusOnOff(isLightTurn);
        printSOS();
    }
    public static boolean statusOnOff(boolean isLightOn) {
        isLightOn = (isLightOn)?false:true;
        return isLightOn;
    }
    public static void printSOS() {
      int i = 0;
      while (isLightTurn && i <= 10){
          System.out.println("__||__");
          i++;
      }
    }
}