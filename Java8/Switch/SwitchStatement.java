package Switch;

public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "D";

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("Light Mode Activado ");
                break;
            case "Nigth":
                System.out.println("Nigth Mode Activado ");
                break;
            case "Blue Dark":
                System.out.println("Dark Mode Blue Activado ");
                break;
            case "Dark":
                System.out.println("Dark Mode Activado ");
                break;
            default:
                System.out.println("Oh, oh, parece que me han robado esa opcion, pero no te preocupes elije otra de las que tenemos :)");
        }
    }
}
