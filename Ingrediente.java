public class Ingrediente {
    private String nombre;
    private int cantidad;

    // Constructor sin parámetros
    public Ingrediente() {
        this.nombre="";
        this.cantidad=0;
    }

    // Constructor
    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters y Setters de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters de Cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Sobrecarga del método toString()
    @Override
    public String toString() {
        return "Ingrediente{" + "nombre='" + nombre + '\'' + ", cantidad=" + cantidad +'}';
    }
}