public class MathematicOperations {
     public static void main(String[] args) {
         
        double x = 3.8;
        double y = 4;

        //Nos muestra el valor de PI
        System.out.println(Math.PI);

        //Nos muestra el valor de Euler
        System.out.println(Math.E);

        /*Nos devuelve un entero.  Si los datos ingresados tinen 
        decimales esta funsión redondea hacia arriba*/
        System.out.println(Math.ceil(x));

        /*Nos devuelve un entero.  Si los datos ingresados tinen 
        decimales esta funsión redondea hacia arriba*/
        System.out.println(Math.floor(x));

        /*Nos devuelve un entero elevado a otro entero
        donde la "x" es la base y "y" el exponente*/
        System.out.println(Math.pow(x, y));

        //Nos devulve el numero mayor ingresado
        System.out.println(Math.max(x, y));

        //Nos devulve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        /*Nos devulve el área de un círculo
        PI * r², donde y es la base y 2 el esponente*/
        System.out.println(Math.PI * Math.pow(y, 2));

        //Área de una esfera
        //4*PI*r²
        System.out.println((4 * Math.PI) * Math.pow(y, 2));

        //Volumen de una esfera
        //(4/3)PI * r³
        System.out.println((4/3 * Math.PI) * Math.pow(y, 3));
        
    }
}
