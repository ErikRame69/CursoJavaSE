package UpdatingVaribles;

public class UpdatingVaribles {
    public static void main(String[] args) {
    
    int salary = 1000;

    //bono $200
    salary = salary + 200;

    //Pensión $50 descuento
    salary = salary - 50;
    System.out.println(salary);

    //2 horas extras $30 c/u
    //Comida $45

    salary = salary + (2*30) - 45;
    System.out.println(salary);

    //Actualizando cadenas de texto
    String employeeName = "Daniel ";
    employeeName = employeeName + "Ramirez Mendoza";
    System.out.println(employeeName);
    
    employeeName = "Erik " + employeeName;
    System.out.println("Tu nombre es: "  + employeeName);


    }
}
