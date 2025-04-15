public class TiendaOnline {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";
       
        // Variables de productos 
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalo = 40.40;
        double precioZapato = 65.30;

   
        // Variables de clientes 
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";
   
        // Estado de pedidos 
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = true;
        boolean pedidoConfirmadoCliente3 = true;
   
        // INTERACCIÓN DE LA APLICACIÓN
        if(pedidoConfirmadoCliente1){
            System.out.println(mensajeBienvenida + cliente1); 
            System.err.println(mensajeConfirmacion);
        }

        if(pedidoConfirmadoCliente2){
            System.out.println(mensajeBienvenida + cliente2); 
            System.err.println(mensajeConfirmacion);
        }

        if(pedidoConfirmadoCliente3){
            System.out.println(mensajeBienvenida + cliente3); 
            double sumaProductos = (precioZapato * 2) + precioCamiseta + precioPantalo;
            System.err.println(mensajeMostrarTotal + sumaProductos);
        }

        if(pedidoConfirmadoCliente3){
            double pedidoUno = precioZapato + precioLibro;
            double pedidoDos = precioPantalo + precioCamiseta;
            double sumaPedidos = pedidoUno + pedidoDos;
            System.err.println( cliente3 + " tú nuevo pedido es de valor:$"+sumaPedidos); 
        }


    }
 }