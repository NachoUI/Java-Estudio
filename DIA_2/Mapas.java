
import java.util.HashMap;

import java.util.Set;

public class Mapas {
    public static void main(String[] args) {
        HashMap<Integer, String> correos = new HashMap<Integer,String>();
        correos.put(12345, "Ignacio@gmail.com");
        correos.put(67891, "Ignacioxjd@gmail.com");
        correos.put(12121, "Ignaciooxjd@gmail.com");



        System.out.println(correos.get(12121));

        Set<Integer> propiedades = correos.keySet();

    }
}
