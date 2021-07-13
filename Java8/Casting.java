public class Casting {
    
    public static void main(String[] args) {
        
        //En un año ubicamos 30 perritos
        //¿Cuántos perritos ubique al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);
        
        /*Nos devulve 2.5 pero, ¿Cómo es eso posible?, ¿acaso parti a un par de perritos a la mitad?
        Para esos casos en los que no necesitamos que nos devuelva los datos con precisión usamos 
        cast donde vamos a convertir dato double en un int*/

        //ESTIMACIÓN
        //para poder hacer cast usaremos los parentesis () con el tipo de dato que queremos que nos devuelva
        int estimatedMounthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMounthlyDogs);

        //EXACTITUD
        /*Ahora tenemos dos datos de tipo entero y al ejecutar la operación nos devuelve un tipo de dato entero
        pero nosotros necesitamos saber el resultado exacto de la operación, para este caso usaremos la 
        el mismo principio encerramos el tipo de dato requerido entre parentesis*/
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);
    }
}
