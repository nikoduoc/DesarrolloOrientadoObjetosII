import data.Pedido;
import data.PedidoComida;
import data.PedidoEncomienda;
import data.PedidoExpress;
import util.UtilPedido;

/**
 * Clase principal del sistema de reparto SpeedFast.
 *
 * Permite probar:
 * - Herencia.
 * - Polimorfismo.
 * - Referencias polimorficas.
 * - Sobrescritura.
 * - Sobrecarga.
 *
 * @author Nicolas Ahumada
 */
public class Main {

    /**
     * Punto de entrada de la aplicacion.
     *
     * @param args argumentos de ejecucion
     */
    public static void main(String[] args) {

        UtilPedido.mostrarTitulo("SPEEDFAST - SISTEMA DE REPARTO");


        /*
         * CREACION DE OBJETOS
         */

        Pedido generico = new Pedido(
                100,
                "Bodega central SpeedFast",
                "Generico"
        );


        PedidoComida comida = new PedidoComida(
                101,
                "Av. Providencia 1234, Santiago",
                "Restaurante La Parrilla",
                3,
                true
        );


        PedidoEncomienda encomienda = new PedidoEncomienda(
                102,
                "Calle Los Aromos 456, Maipu",
                12.5,
                "Caja de carton",
                true
        );


        PedidoExpress express = new PedidoExpress(
                103,
                "Pasaje El Roble 789, Nunoa",
                "Farmacia Central",
                2.5,
                true
        );


        /*
         * POLIMORFISMO
         *
         * El arreglo es de tipo Pedido, pero almacena
         * objetos de diferentes clases hijas.
         */

        Pedido[] pedidos = {
                generico,
                comida,
                encomienda,
                express
        };


        UtilPedido.mostrarTitulo("POLIMORFISMO Y SOBRESCRITURA");


        /*
         * REFERENCIA POLIMORFICA
         *
         * pedido siempre es de tipo Pedido, pero en cada
         * iteracion referencia a un objeto diferente.
         */

        for (Pedido pedido : pedidos) {
            pedido.asignarRepartidor();
        }


        UtilPedido.mostrarTitulo("SOBRECARGA DE METODOS");


        /*
         * SOBRECARGA
         *
         * Se llama al mismo metodo, pero con un parametro
         * String con el nombre del repartidor.
         */

        comida.asignarRepartidor("Camila Rojas");
        encomienda.asignarRepartidor("Diego Fuentes");
        express.asignarRepartidor("Valentina Munoz");


        UtilPedido.mostrarTitulo("CASOS QUE NO CUMPLEN EL CRITERIO");


        /*
         * Se crean objetos que no cumplen los requisitos
         * para mostrar la validacion de cada subclase.
         */

        PedidoComida comidaSinMochila = new PedidoComida(
                201,
                "Av. Matta 321, Santiago",
                "Sushi Express",
                2,
                false
        );


        PedidoEncomienda encomiendaPesada = new PedidoEncomienda(
                202,
                "Camino Melipilla 999, Cerrillos",
                40.0,
                "Pallet",
                false
        );


        PedidoExpress expressLejano = new PedidoExpress(
                203,
                "Ruta 68 km 20, Curacavi",
                "Supermercado Lider",
                18.0,
                false
        );


        comidaSinMochila.asignarRepartidor("Jorge Silva");
        encomiendaPesada.asignarRepartidor("Ana Lopez");
        expressLejano.asignarRepartidor("Pablo Vera");


        UtilPedido.mostrarTitulo("FIN DE LAS PRUEBAS");
    }
}
