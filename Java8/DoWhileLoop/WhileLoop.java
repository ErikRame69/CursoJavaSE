package DoWhileLoop;

public class WhileLoop {
    
    static boolean IsTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOfLigth();

        int i=1;
        while(IsTurnOnLight && i<=10)
        {
            printSOS();
            i++;
        }
    }
    public static void printSOS()
    {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOfLigth() {

        //Con esta linea de codigo llamada operador ternario nos ahorramos...
        IsTurnOnLight= (IsTurnOnLight)?false:true; 
        return IsTurnOnLight;
        /*Todo est codigo
        if(IsTurnOnLight){
            IsTurnOnLight = false;
        }
        else {
            IsTurnOnLight = true;
        }
        return IsTurnOnLight;
        */
    }

}
