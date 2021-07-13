public class DataTypes {
    public static void main(String[] args) {
        
        //Solo nos permite hasta 10 digitos
        int n = 1234567890;

        /*Para que se pueda diferenciar 
        como un tipo de dato long vamos
        a poner una L al final de la cifra*/
        long nL = 12345687901L;

        /*Para diferenciar un Float colocamos
        una F al final*/
        double nD = 123.456;
        float nF = 123.456F; 


        //NUMEROS
        
        /*Declarando variables sin asignar el tipo de dato
        Función disponible a partir de Java 10*/
        var salary = 1000.00;
        //Pensión 
        var pension = salary*0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);


        //CADENAS
        var employeeName = "Erik Ramirez";
        System.out.println("EMPLOYE: " + employeeName + "  SALARY: " + totalSalary);


    }
}