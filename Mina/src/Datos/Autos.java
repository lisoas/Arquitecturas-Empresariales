/*
 * Clase la cual representa lo autos los cuales notifica a la cantidad y tipo de
 * material que transportaban cuando llegan a su destino.
 */
package Datos;

/**
 *
 * @author Usuario
 */
public class Autos {
    // Atributo el cual define si llego el carro
    int ready; 
    int cantidad;
    String tipoMaterial;

    public Autos() {
    }

    
    public Autos(int cantidad, String tipoMaterial) {
        this.cantidad = cantidad;
        this.tipoMaterial = tipoMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    
    
}
