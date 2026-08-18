package data;

import util.UtilPedido;

/**
 * Representa una compra express en supermercado o farmacia.
 * Criterio: se asigna al repartidor mas cercano que tenga
 * disponibilidad inmediata.
 *
 * @author Nicolas Ahumada
 */
public class PedidoExpress extends Pedido {

    private static final double DISTANCIA_MAXIMA = 5.0;

    private String tienda;
    private double distanciaKm;
    private boolean disponibilidadInmediata;

    /**
     * Construye una compra express.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega direccion de entrega
     * @param tienda tienda de origen
     * @param distanciaKm distancia del repartidor mas cercano
     * @param disponibilidadInmediata true si esta disponible ahora
     */
    public PedidoExpress(int idPedido,
                         String direccionEntrega,
                         String tienda,
                         double distanciaKm,
                         boolean disponibilidadInmediata) {

        super(idPedido, direccionEntrega, "Compra Express");

        this.tienda = tienda;
        this.distanciaKm = distanciaKm;
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    /**
     * Sobrescribe el metodo de la superclase aplicando
     * el criterio propio de las compras express.
     */
    @Override
    public void asignarRepartidor() {

        System.out.println("COMPRA EXPRESS");
        System.out.println("ID: " + getIdPedido());
        System.out.println("Tienda: " + tienda);
        System.out.println("Distancia repartidor: " + distanciaKm + " km");
        System.out.println("Direccion: " + getDireccionEntrega());
        System.out.println("Criterio: repartidor mas cercano con "
                + "disponibilidad inmediata.");

        if (disponibilidadInmediata && distanciaKm <= DISTANCIA_MAXIMA) {
            System.out.println("Repartidor cercano y disponible. "
                    + "Asignacion inmediata.");
        } else {
            System.out.println("No hay repartidor cercano disponible. "
                    + "Pedido en cola de espera.");
        }

        UtilPedido.mostrarSeparador();
    }

    /**
     * Version sobrecargada con validacion de cercania
     * y disponibilidad inmediata.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {

        System.out.println("COMPRA EXPRESS - ID " + getIdPedido());
        System.out.println("Repartidor propuesto: " + nombreRepartidor);
        System.out.println("Validando cercania y disponibilidad...");

        if (disponibilidadInmediata && distanciaKm <= DISTANCIA_MAXIMA) {
            System.out.println(nombreRepartidor + " esta a "
                    + distanciaKm + " km y disponible ahora.");
            System.out.println("Compra en " + tienda + " asignada.");
        } else {
            System.out.println(nombreRepartidor
                    + " no cumple el criterio express.");
            System.out.println("Distancia: " + distanciaKm
                    + " km | Disponible: " + disponibilidadInmediata);
        }

        UtilPedido.mostrarSeparador();
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public boolean isDisponibilidadInmediata() {
        return disponibilidadInmediata;
    }

    public void setDisponibilidadInmediata(
            boolean disponibilidadInmediata) {

        this.disponibilidadInmediata = disponibilidadInmediata;
    }
}
