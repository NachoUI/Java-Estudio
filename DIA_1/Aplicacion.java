import java.util.Date; //Aqui arriba se importan los paquetes 

public class Aplicacion {
    public static void main(String[] args) {
        //Modularizacion 
       double resultado = MiClaseMath.multiplicar(2.0, 8.9);
        System.out.println("EL resultado es : " + resultado);


        Date fecha = new Date(); //Clase importada ya creada por java
        System.err.println("Fecha" + fecha);
    }
}
