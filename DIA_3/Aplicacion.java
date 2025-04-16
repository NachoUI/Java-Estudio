
public class Aplicacion {
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion(3,4);

        fraccion1.imprimeFraccion();

        //Aqui el valor de 3 pasa hacer un 1 ya que mandamos por
        // param el numero 1
        fraccion1.setNumerador(1);

    }
}
