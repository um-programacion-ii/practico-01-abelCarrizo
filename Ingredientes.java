public class Ingredientes {
    private String nombre;
    private int cantidad;

    //Constructor
    public Ingredientes(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //Getters y Setters de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getters y Setters de Cantidad
    public int getCantidad() {
        return cantidad;
    }
}