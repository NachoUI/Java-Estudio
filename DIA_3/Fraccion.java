public class Fraccion {


    // Atributos 
    /*
      > Propiedades que van a describir miclase 
     */
     private int numerador;
     private int denominador;


     // Constructor 
     /*
       > Se encarga de construir el objeto 
      */
    public Fraccion(int num, int den){
        this.numerador = num; 
        this.denominador = den;
    }

    // Metodo instancia 
    /*
        > Tenemos que crear el objeto para poder ocuparlo
     */
    public void imprimeFraccion(){
        System.out.println(this.numerador + "/" + this.denominador);
    }


    // Metodo para sumar dos fracciones
    public Fraccion sumaFracciones(Fraccion otra){
        int nuevoNum = this.numerador * otra.getDenominador() + otra.getNumerador() * this.denominador;
        int nuevoDen = this.denominador * otra.getDenominador();
        Fraccion nueva = new Fraccion(nuevoNum, nuevoDen);
        return nueva;
    }


    //Getteres y Setters 
    /*
        Los getteres solo se encargar de regresar un valor
     */

     public int getNumerador(){
        return  this.numerador;
     }

     /*
         Los setter lo que hacen es actualizar el valor de mi atributo
      */
     public void setNumerador(int num){
        this.numerador = num;
     }
    

     //Denominador getters and setters
     public int getDenominador(){
        return  this.denominador;
     }

     public void setDenominador(int den){
        this.denominador = den;
     }
}