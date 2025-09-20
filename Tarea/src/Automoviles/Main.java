package Automoviles;

// Importar clases de otros paquetes
import Vehiculos.Vehiculo;
import vehiculointerfaz.Combustible;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Toyota", "Corolla");
        vehiculos[1] = new Moto("Yamaha", "R15");
        vehiculos[2] = new Camion("Volvo", "FH16");

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            v.mover();

            if (v instanceof Combustible) {
                ((Combustible) v).recargar();
            }
            System.out.println("-------------------");
        }
    }
}
