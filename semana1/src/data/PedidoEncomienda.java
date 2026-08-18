package data;

import util.UtilPedido;

/**
 * Representa el envio de una encomienda (documentos o paquetes).
 * Criterio: se valida el peso y el embalaje del paquete.
 *
 * @author Nicolas Ahumada
 */
public class PedidoEncomienda extends Pedido {

    private static final double PESO_MAXIMO = 25.0;

    private double pesoKg;
    private String tipoEmbalaje;
    private boolean fragil;

    /**
     * Construye un pedido de encomienda.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega direccion de entrega
     * @param pesoKg peso del paquete en kilogramos
     * @param tipoEmbalaje tipo de embalaje utilizado
     * @param fragil true si el contenido es fragil
     */
    public PedidoEncomienda(int idPedido,
                            String direccionEntrega,
                            double pesoKg,
                            String tipoEmbalaje,
                            boolean fragil) {

        super(idPedido, direccionEntrega, "Encomienda");

        this.pesoKg = pesoKg;
        this.tipoEmbalaje = tipoEmbalaje;
        this.fragil = fragil;
    }

    /**
     * Sobrescribe el metodo de la superclase aplicando
     * el criterio propio de las encomiendas.
     */
    @Override
    public void asignarRepartidor() {

        System.out.println("PEDIDO DE ENCOMIENDA");
        System.out.println("ID: " + getIdPedido());
        System.out.println("Peso: " + pesoKg + " kg");
        System.out.println("Embalaje: " + tipoEmbalaje);
        System.out.println("Fragil: " + fragil);
        System.out.println("Direccion: " + getDireccionEntrega());
        System.out.println("Criterio: validacion de peso y embalaje.");

        if (pesoKg <= PESO_MAXIMO) {
            System.out.println("Peso dentro del limite. "
                    + "Se asigna repartidor en moto.");
        } else {
            System.out.println("Peso superior a " + PESO_MAXIMO
                    + " kg. Se deriva a reparto en furgon.");
        }

        UtilPedido.mostrarSeparador();
    }

    /**
     * Version sobrecargada con validacion de peso y embalaje.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {

        System.out.println("PEDIDO DE ENCOMIENDA - ID " + getIdPedido());
        System.out.println("Repartidor propuesto: " + nombreRepartidor);
        System.out.println("Validando peso y embalaje...");

        if (pesoKg > 0 && pesoKg <= PESO_MAXIMO) {

            System.out.println("Peso validado: " + pesoKg + " kg");
            System.out.println("Embalaje validado: " + tipoEmbalaje);

            if (fragil) {
                System.out.println("Aviso: contenido fragil, "
                        + "manipular con cuidado.");
            }

            System.out.println("Encomienda asignada a "
                    + nombreRepartidor + ".");
        } else {
            System.out.println("Peso fuera de rango: " + pesoKg
                    + " kg (maximo " + PESO_MAXIMO + " kg).");
            System.out.println("No es posible asignar a "
                    + nombreRepartidor + ".");
        }

        UtilPedido.mostrarSeparador();
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}
