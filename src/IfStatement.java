public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSend = 3;

        if (isBluetoothEnabled) {
            System.out.println("File sent");
        }else {
            System.out.println("Please turn on your bluetooth and try again");
        }
    }
}
