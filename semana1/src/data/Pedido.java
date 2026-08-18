package data;

/**
 * Representa un pedido generico de la empresa SpeedFast.
 * Contiene los atributos y comportamientos comunes a todos
 * los tipos de pedido.
 *
 * Los atributos son privados y se acceden mediante
 * metodos get y set (encapsulamiento).
 *
 * @author Nicolas Ahumada
 */
public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    /**
     * Construye un pedido con sus datos principales.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega direccion de entrega
     * @param tipoPedido tipo de pedido
     */
    public Pedido(int idPedido,
                  String direccionEntrega,
                  String tipoPedido) {

        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    /**
     * Asigna un repartidor de manera generica.
     * Este metodo puede ser sobrescrito por las clases hijas.
     */
    public void asignarRepartidor() {

        System.out.println("Asignando repartidor generico...");
        System.out.println("Pedido N: " + idPedido);
        System.out.println("Tipo: " + tipoPedido);
        System.out.println("Direccion: " + direccionEntrega);
        System.out.println("Sin criterios especiales de asignacion.");
    }

    /**
     * Version sobrecargada: recibe el nombre del repartidor
     * que se quiere asignar al pedido.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor) {

        System.out.println("Pedido N: " + idPedido
                + " | Tipo: " + tipoPedido);
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        System.out.println("Destino: " + direccionEntrega);
        System.out.println("Sin validaciones adicionales.");
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
}
