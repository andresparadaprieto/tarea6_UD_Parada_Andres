/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6_andres_parada;

/**
 *
 * @author Andres
 */
public class Facturacion {
    private static final int LIMITE_DESCUENTO = 3;
    private static final double DESCUENTO_PRO = 0.8;
    private static final double DESCUENTO_BASICO = 0.95;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > LIMITE_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * DESCUENTO_PRO;
            muestraTotal(Total);
        } else {
            Total = precioProducto * DESCUENTO_BASICO;
            muestraTotal(Total);
        }

    }


    private void muestraTotal(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
}
