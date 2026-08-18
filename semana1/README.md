# SpeedFast - Semana 1

Actividad formativa de Desarrollo Orientado a Objetos II (PRY2203).
Nicolas Ahumada.

## Descripcion

Sistema de asignacion de repartidores para la empresa SpeedFast.
Cada tipo de pedido tiene un criterio distinto de asignacion:

- **Comida**: el repartidor debe tener mochila termica.
- **Encomienda**: se valida el peso y el embalaje.
- **Compra Express**: repartidor mas cercano con disponibilidad inmediata.

## Estructura

```
src/
├── Main.java                  (pruebas)
├── data/
│   ├── Pedido.java            (clase base)
│   ├── PedidoComida.java
│   ├── PedidoEncomienda.java
│   └── PedidoExpress.java
└── util/
    └── UtilPedido.java        (titulos y separadores)
```

## Conceptos aplicados

- **Herencia**: las tres subclases heredan de `Pedido` con `extends` y llaman a `super()` en el constructor.
- **Encapsulamiento**: los atributos son privados, se accede con getters y setters.
- **Sobrescritura**: cada subclase redefine `asignarRepartidor()` con `@Override`.
- **Sobrecarga**: existe tambien `asignarRepartidor(String nombreRepartidor)`, con distinta firma.
- **Polimorfismo**: en `Main` se recorre un arreglo `Pedido[]` y cada objeto ejecuta su propia version del metodo.

## Como ejecutar

Abrir el proyecto en IntelliJ IDEA y ejecutar `Main.java`.
