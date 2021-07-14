package Arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersion = new String[17];
        String days[] = new String[7];

        androidVersion [0] = "Apple Pie";
        androidVersion [1] = "Banana Bread";
        androidVersion [2] = "Cupcake";
        androidVersion [3] = "Donut";
        
        //¿Cómo accedo a un datos para poder verlo?
        System.out.println("Esta son algunas de las varsiones de java");
        System.out.println(androidVersion[0]);
        System.out.println(androidVersion[1]);
        System.out.println(androidVersion[2]);
        System.out.println(androidVersion[3]);
        
        
        //Array de dos dimensiones
        String[][] cities = new String[4][2];

        /**
         * +-------------+-------------+
         * |  Country    |  City       |
         * +-------------+-------------+
         * |  México     | CDMX        |
         * |  México     | Guadalajara | 
         * |  Colombia   | Bogotá      |
         * |  Colombia   | Medellín    |
         * |             |             |
         * +-------------+-------------+    
         */

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        System.out.println("Ciudades y paises");
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

         int [][][] numbers = new int[2][2][2];
         int [][][][] numbers4 = new int [2][2][2][2];
         
        }

    /*Esto es una limitante, no siempre en nuestro projecto vamos a usar arrays, 
    si nos ayuda con problemas de logicas o espacio pero el problema principal 
    del array es que conforme pase el tiempo no podra ir creciendo.*/
}
