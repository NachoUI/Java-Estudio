public class Condicionales {
    public static void main(String args[]) {
        double califiacion = 7.8;
        String nombre1 = new String("Alex");
        String nombre2 = new String("Alex");
        Double califiacion2 = 9.7;


        if (califiacion >= 8.0) {
            System.out.println("Felicidades aprobaste el examen");
        } else {
            System.out.println("Esta vez no has aprobado pruebalo la proxima vez");
        }

        if (nombre1 == nombre2) { // => Esto nos mostrara que no son iguales
            System.out.println("Si son iguales");
        } else {
            System.out.println("No son iguales");
        }

        // Si queremos que se comparen string se ocupa el equals
        if (nombre1.equals(nombre2)) {
            System.out.println("Si son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}