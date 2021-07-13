package ForLoop;

public class ForLoop {
    static boolean IsTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOfLigth();

        for (int i = 1; i <= 10; i++) {
            printSOS();
        }
    }

    public static void printSOS()
    {
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOfLigth() {
        IsTurnOnLight = (IsTurnOnLight)?false:true; 
        return IsTurnOnLight;
    }
}
