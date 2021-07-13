package IfStatement;

public class IfStatement {
    
    public static void main(String[] args) {
        
        //Supongamos que queremos enviar un archivo via bluetooth
        //Debemos de verificar que el bluetooth este prendido

        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled)
        {
            fileSended++;
            System.out.println("Arichivo Enviado   " + "Cantidad de archivos enviados con exito: " + fileSended);
        }
    }

}
