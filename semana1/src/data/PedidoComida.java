package data;

import util.UtilPedido;

/**
 * Representa un pedido de comida de un restaurante.
 * Criterio: el repartidor debe tener mochila termica.
 *
 * @author Nicolas Ahumada
 */
public class PedidoComida extends Pedido {

    private String restaurante;
    private int cantidadPlatos;
    private boolean mochilaTermica;

    /**
     * Construye un pedido de comida.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega direccion de entrega
     * @param restaurante restaurante de origen
     * @param cantidadPlatos cantidad de platos
     * @param mochilaTermica true si se cuenta con mochila termica
     */
    public PedidoComida(int idPedido,
                        String direccionEntrega,
                        String restaurante,
                        int cantidadPlatos,
                        boolean mochilaTermica) {

        super(idPedido, direccionEntrega, "Comida");

        this.restaurante = restaurante;
        this.cantidadPlatos = cantidadPlatos;
        this.mochilaTermica = mochilaTermica;
    }

    /**
     * Sobrescribe el metodo de la superclase aplicando
     * el criterio propio de los pedidos de comida.
     */
    @Override
    public void asignarRepartidor() {

        System.out.println("PEDIDO DE COMIDA");
        System.out.println("ID: " + getIdPedido());
        System.out.println("Restaurante: " + restaurante);
        System.out.println("Platos: " + cantidadPlatos);
        System.out.println("Direccion: " + getDireccionEntrega());
        System.out.println("Criterio: repartidor con mochila termica.");

        if (mochilaTermica) {
            System.out.println("Hay repartidor con mochila termica. "
                    + "Asignacion aprobada.");
        } else {
            System.out.println("No hay repartidor con mochila termica. "
                    + "Pedido en espera.");
        }

        UtilPedido.mostrarSeparador();
    }

    /**
     * Version sobrecargada con validacion de mochila termica.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {

        System.out.println("PEDIDO DE COMIDA - ID " + getIdPedido());
        System.out.println("Repartidor propuesto: " + nombreRepartidor);
        System.out.println("Validando mochila termica...");

        if (mochilaTermica) {
            System.out.println(nombreRepartidor
                    + " cuenta con mochila termica.");
            System.out.println("Pedido asignado: " + cantidadPlatos
                    + " plato(s) de " + restaurante);
        } else {
            System.out.println(nombreRepartidor
                    + " NO cuenta con mochila termica.");
            System.out.println("Asignacion rechazada.");
        }

        UtilPedido.mostrarSeparador();
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getCantidadPlatos() {
        return cantidadPlatos;
    }

    public void setCantidadPlatos(int cantidadPlatos) {
        this.cantidadPlatos = cantidadPlatos;
    }

    public boolean isMochilaTermica() {
        return mochilaTermica;
    }

    public void setMochilaTermica(boolean mochilaTermica) {
        this.mochilaTermica = mochilaTermica;
    }
}
