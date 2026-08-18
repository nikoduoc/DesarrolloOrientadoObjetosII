package util;

/**
 * Contiene metodos auxiliares utilizados
 * para mejorar la presentacion en consola.
 *
 * @author Nicolas Ahumada
 */
public class UtilPedido {

    /**
     * Muestra un titulo destacado en consola.
     *
     * @param titulo texto que se desea mostrar
     */
    public static void mostrarTitulo(String titulo) {

        System.out.println();
        System.out.println("========================================");
        System.out.println(titulo);
        System.out.println("========================================");
    }

    /**
     * Muestra una linea separadora en consola.
     */
    public static void mostrarSeparador() {
        System.out.println("----------------------------------------");
    }
}
