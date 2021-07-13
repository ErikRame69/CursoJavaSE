public class IncrementDecrement {
    
    public static void main(String[] args) {
    
    /*Para este ejemplo vamos a suponer que estamos jugando MarioBros
    y estamos saltando y corriendo, y todo lo que se haga vaya.
    
    Como sabemos mario puede ganar o perder vidas y eso es lo que 
    usaremos para nuestro ejemplo*/


    //Posfija
    //La forma en que lo estamos viendo es de la forma posfija

    int lives = 5;
    lives = lives - 1;
    System.out.println(lives); //Queda 4 vidas
     
    /*Pero para no hacerlo tan complejo podemos 
    usar un operador de decremento */

    lives--; //Decremento
    System.out.println(lives); // Quedan 3 

    lives++; //Incremento
    System.out.println(lives); //Quedan 4
    
    
    //Prefija
    //Vamos a verlo de la manera prefija
    int gift = 100 + lives++; //prefijo 
    /*En este caso vamos a leer primero la variable y despues 
    que se leyo e imprimio en la pantalla se hara el incremento*/
    System.out.println(gift);
    System.out.println(lives); 
    /*Si corremos el programa nos dara lo siguiente 
    gift = 104
    y despues de ejecutado ese comando se le hara el incremento y 
    si volvemos a imprimir en pantalla lives nos saldra
    lives =5*/
    }

}
