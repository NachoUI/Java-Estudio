public class MetodosEstaticos {
    public static void main(String[] args) {
        String nombre = "Ignacio";

        // Existen dos formas para ejecutar una funcion
        // Manera 1, siempre y cuando respete las reglas
        String resultado = mensaje(nombre);
        // Manera 2
        String resultado2 = MetodosEstaticos.mensaje("Marta");
        System.err.println(resultado);
        System.err.println(resultado2);

        /*
         * Esto se puede resumir como se muestra en la LINEA 6
         * esto se puede hacer ya que solo se podra hacer cuando la
         * funcion este nuestra clase
         * String resultado = MetodosEstaticos.mensaje(nombre);
         */

        System.out.println(sumaDosNumeros(10.5, 19.5));

    }

    // Definicion metodos Staticos esto es igual a decir que es una
    // funcion de js

    // Metodo STATICO tiene que indicar que retorna
    public static String mensaje(String nombre) {
        return "Bienvenido al stack de Java/Spring" + " " + nombre;
    }

    // Metodo STATICO
    public static double sumaDosNumeros(double num1, double num2) {
        double resultadoSuma = num1 + num2;
        return resultadoSuma;
    }

}
