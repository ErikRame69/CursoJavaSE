package NamingJava;
            //Upper Camel Case y el nombre de la clase
             // en este caso la clave es NaminaJava
public class NamingJava {
    
    public static void main(String[] args) {

        int celphone = 33337777;
        int celPhone = 22228888;

        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName = "México";
        String $ColorString = "Green";

        /*Manera incorrecta de crear una varible
        String back-grund
        */

        // DECLARACION DE CONSTANTES
        int POSITION = -5;
        int MAX_WTDTH = 9999;
        int MIN_WIDTH = 1;

        //Lower Camel Case
        String fullName = "Erik Daniel Ramirez Mendoza";
        int sizeInCentimeters = 170;

        //Los imprimi en pantalla solamente para que no me presente errores en la consola de VS code
        System.out.println($countryName + "  " + $ColorString + "  " + fullName);
        System.out.println(sizeInCentimeters + "  " + POSITION + "  " + MAX_WTDTH + "  " + MIN_WIDTH);
    }
}
