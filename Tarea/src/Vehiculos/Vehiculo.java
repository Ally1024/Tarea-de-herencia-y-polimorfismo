package Vehiculos;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /*Método abstracto que cada subclase debe implementar*/
    public abstract void mover();

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
}


