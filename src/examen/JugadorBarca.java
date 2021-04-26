
package examen;

public class JugadorBarca {
                               //DECLARACION DE CLASES
    //ATRIBUTOS
   private int dorsal;
   private String nombre;
   private String posicion;
   private double goles_anotados;
   
   // CONTRUCTORES (SOBRECARGA)
   
   public JugadorBarca(){
       
   }

    public JugadorBarca(int dorsal, String posicion) {
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public JugadorBarca(String nombre) {
        this.nombre = nombre;
    }


   
    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setGoles_anotados(double goles_anotados) {
        this.goles_anotados = goles_anotados;
    }
    
    
   // GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getGoles_anotados() {
        return goles_anotados;
    }
    
    //METODO CON PASO DE VARIABLES POR VALOR
public void inicial(String nombre){
    System.out.println("El nombre de " + nombre + " comienza por " + nombre.substring(0,1));
}    
//METODO CON SOBRECARGA DE OPERADORES
public void promgoles(double goles_anotados){
        double resultado;
    resultado = goles_anotados/35;

    System.out.println("La presente temporada lleva 35 jornadas " +nombre+ " tiene un promedio "
            + " de goles de "+(double)Math.round(resultado * 100 )/100+ " por partido");
}
}
