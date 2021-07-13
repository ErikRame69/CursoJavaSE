public class Cast {
    
    public static void main(String[] args) {
        
        /*Ejercicio 2
        Usando los dos tipos de casting que aprendiste (implícito y explícito),
        resuelve los siguientes casteos indicando qué tipo es y si se está calculando
        estimación o exactitud.
        - char c = ‘z’; conviertelo a **int**
        - int i = 250; conviertelo a **long** y luego de **long** a **short**
        - double d = 301.067;  conviertelo a **long**
        - int i = 100; súmale 5000.66 y conviertelo a **float**
        - int i = 737; multiplícalo por 100 y conviertelo a **byte**
        - double d = 298.638; divídelo entre 25 y conviertelo a **long** */

        char c = 'z';
        System.out.println((int)c);

        int i = 250;
        long i1 = i;    
        System.out.println((short)i1);

        int i2 = 100;
        double i_2 = 5000.66;
        System.out.println((float) i2 + i_2);

        int i3 = 737 * 100;
        System.out.println((byte)i3);

        double d = 298.638/25;
        System.out.println((long)d);

    }

}
