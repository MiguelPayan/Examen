
package examen;

import java.util.Scanner;

public class Mensaje {
    Scanner sc = new Scanner(System.in);
    String mensaje;
    
    public Mensaje() {
       
    } 
    //METODO CON UN OBJETO COMO PARAMETRO 
    //SOBRECARGA DE METODOS
public void mandar_mensaje(JugadorBarca j1){
        System.out.println("Escribe un mensaje para mandarle a " + j1.getNombre());
        mensaje = sc.nextLine();
}
    
public void mandar_mensaje(){
    System.err.println("Se mando tu mensaje al jugador del FC BARCELONA");
}    

}
