package IfStatement;

public class IfStatement {
    
    public static void main(String[] args) {
        
        //Supongamos que queremos enviar un archivo via bluetooth
        //Debemos de verificar que el bluetooth este prendido

        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled)
        {
            fileSended++; 
            System.out.println("Arichivo Enviado   " + "Cantidad de archivos enviados con exito: " + fileSended);   
        }
        else
        {
             System.out.println("¡Vaya!, parece el bluetooth esta apagado, enciendelo para trasferir los archivos.");
        }
        
        
    }

}
