package Funciones;

public class Funciones {
    
    /**
     * Clase donde imprimimos en pantala los resultados de las funciones.
     * @param args argumeto de la clasee
     */
    public static void main(String[] args) 
    
    {
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

    /**
     * Función donde calculamos el área de un círculo
     * @param r es el radio
     * @returnNos retorna elresultado de la variable
     */
    public static double circleArea (double r){
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Función donde calculamos el área de una esfera
     * @param r es el radio
     * @return retorna el área de la esfera
     */
    public static double spheraArea (double r){
        return 4 * Math.PI * Math.pow (r, 2);
    }

    /**
     * Función donde calculamos el volumen de una esfera
     * @param r es el radio de la esfera
     * @return nos retorna el valor del volumen de la esfera
     */
    public static double sphereVolumen (double r){
        return 4/3 * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripción: Función que especificando su moned, convierte una cantidad de dinero a dolares.
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Sólo acepta MXN o COP
     * @return quantity devuelve la cantida en dolares.
     */

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
