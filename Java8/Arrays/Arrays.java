package Arrays;

import java.nio.file.FileSystemAlreadyExistsException;

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        androidVersions [0] = "Apple Pie";
        androidVersions [1] = "Banana Bread";
        androidVersions [2] = "Cupcake";
        androidVersions [3] = "Donut";

        for (int i=0; i<=androidVersions.length-1; i++)
        {
            System.out.println(androidVersions[i]);
        }
        
        for (String androidVersion : androidVersions ) 
        {
            System.out.println(androidVersion);
            
        }
        /*-¿Cómo accedo a un datos para poder verlo?
        System.out.println("Esta son algunas de las varsiones de java");
        System.out.println(androidVersion[0]);
        System.out.println(androidVersion[1]);
        System.out.println(androidVersion[2]);
        System.out.println(androidVersion[3]);
        */
        
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
 
        for(int i = 0; i < cities.length; i++)
        {
            for (int j=0; j<cities[i].length; j++){
                System.out.println(cities[i][j]);
            }
            
        }

        /*System.out.println("Ciudades y paises");
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        for (String[] pair : cities) {
            for (String name : pair) {
                System.out.println(name);
            }
        }

        /*En que posición se encuentra el changito*/
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1]= "Monkey";

        for (int i = 1; i < animals.length; i++) {
            for (int j = 0; j < animals.length; j++) {
                for (int k = 0; k < animals.length; k++) {
                    for (int l = 1; l < animals.length; l++) {
                        System.out.println(animals [i][j][k][l]);
                    }
                }
            }
            
        }         


         int [][][] numbers = new int[2][2][2];
         int [][][][] numbers4 = new int [2][2][2][2];
         
        }

    /*Esto es una limitante, no siempre en nuestro projecto vamos a usar arrays, 
    si nos ayuda con problemas de logicas o espacio pero el problema principal 
    del array es que conforme pase el tiempo no podra ir creciendo.*/
}
