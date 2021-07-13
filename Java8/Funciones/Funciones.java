package Funciones;

public class Funciones {
    public static void main(String[] args) {

        double y = 3;
         /*Nos devulve el área de un círculo
        PI * r², donde y es la base y 2 el esponente*/
        System.out.println(circleArea(y));

        //Área de una esfera
        //4*PI*r²
        System.out.println(spheraArea(y));

        //Volumen de una esfera
        //(4/3)PI * r³
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS A DOLARES:" + converToDolar(1000, "MXN"));
    }

    public static double circleArea (double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double spheraArea (double r){
        return 4 * Math.PI * Math.pow (r, 2);
    }

    public static double sphereVolumen (double r){
        return 4/3 * Math.PI * Math.pow(r, 3);
    }

    public static double converToDolar (double quantity, String currency){
        //MXN, COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.52;
                break;
            case "COP":
                quantity = quantity * 0.00031;
        }
        return quantity;
    }
}
