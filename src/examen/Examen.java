
package examen;

import java.util.Scanner;

public class Examen {

    
    public static void main(String[] args) {
        //INSTANCIACION DE UNA CLASE
        JugadorBarca j1 = new JugadorBarca();
        JugadorBarca j2 = new JugadorBarca();
        Mensaje m = new Mensaje();
        //DECLARACION DE VARIABLES
        Scanner sc = new Scanner(System.in);
        String mensaje;
        int eleccion;
        int numero;
        
        //COMENZAMOS PREGUNTANDOLE AL USUARIO QUE DESEA HACER (LA OPCION 2 ES SOLO PARA REPRESENTAR AL DESTRUCTOR)
        System.out.println("Elige una opcion CONTINUAR (1) o SALIR(2)");
        eleccion = sc.nextInt();
        if(eleccion == 1){
            System.out.println("Elige el numero de algun dorsal del 1 al 11 de algun jugador del FC Barcelona");
            numero= sc.nextInt();
            switch(numero){
                //SE ESTABLECEN LOS VALORES PARA CADA ATRIBUTO DEL OBJETO JugadorBarxa
                case 1: j1.setDorsal(numero); j1.setNombre("Ter Stegen"); j1.setPosicion("Arquero"); j1.setGoles_anotados(0);
                //SE OBTIENEN LOS VALORES PARA IMPRIMIRLOS
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                    //REFERENCIA AL OBJETO ACTUAL LLAMANDO A SUS METODOS
                    j1.inicial(j1.getNombre());
                    //EN EL SIGUIENTE METODO SE UTILIZA LA SOBRECARGA DE OPERADORES
                    j1.promgoles(j1.getGoles_anotados());
                    //UTILIZAMOS LA SOBRECARGA DE METODOS
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                   
                    break;
                case 2: j1.setDorsal(numero); j1.setNombre("Sergiño Dest"); j1.setPosicion("Defensa"); j1.setGoles_anotados(2);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1);
                    m.mandar_mensaje();
                    break;
                case 3: j1.setDorsal(numero); j1.setNombre("Gerard pique"); j1.setPosicion("Defensa"); j1.setGoles_anotados(0);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                    j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 4: j1.setDorsal(numero); j1.setNombre("Ronald Araujo"); j1.setPosicion("Defensa"); j1.setGoles_anotados(2);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");          
                                        j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 5: j1.setDorsal(numero); j1.setNombre("Sergio Busquets"); j1.setPosicion("Medio"); j1.setGoles_anotados(0);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                                       j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 6: j1.setDorsal(numero); j1.setNombre("Aleñá"); j1.setPosicion("Medio"); j1.setGoles_anotados(0);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                                        j1.inicial(j1.getNombre());
                   j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 7: j1.setDorsal(numero); j1.setNombre("Antonie Griezmann"); j1.setPosicion("Ataque"); j1.setGoles_anotados(11);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                                        j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 8: j1.setDorsal(numero); j1.setNombre("Pjanic"); j1.setPosicion("Medio"); j1.setGoles_anotados(0);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");   
                                        j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 9: j1.setDorsal(numero); j1.setNombre("Martin Brithwaite"); j1.setPosicion("Ataque"); j1.setGoles_anotados(2);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                                       j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 10: j1.setDorsal(numero); j1.setNombre("Lionel Messi"); j1.setPosicion("Ataque"); j1.setGoles_anotados(25);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                                       j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                case 11: j1.setDorsal(numero); j1.setNombre("Ousmane Dembele"); j1.setPosicion("Ataque"); j1.setGoles_anotados(5);
                    System.out.println("El nombre del jugador es "+j1.getNombre()+" su posicion es "+ j1.getPosicion()+ " y ha anotado " + j1.getGoles_anotados()+" goles esta temporada con el FC BARCELONA");
                                        j1.inicial(j1.getNombre());
                    j1.promgoles(j1.getGoles_anotados());
                    m.mandar_mensaje(j1); 
                    m.mandar_mensaje();
                    break;
                default: System.out.println("Debes ingresar un numero entero del 1 al 11");
                break;
                
            }
        }
        if (eleccion ==2){
            System.out.println("Gracias por utilizar");
            System.exit(0); //METODO DESTRUCTOR
        }
        
        
        
        
        
   
    }
    
}
