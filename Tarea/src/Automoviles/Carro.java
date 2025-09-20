package Automoviles;

// Importamos Vehiculo e Interfaz Combustible
import Vehiculos.Vehiculo;
import vehiculointerfaz.Combustible;

public class Carro extends Vehiculo implements Combustible {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El carro avanza por la carretera.");
    }

    @Override
    public void recargar() {
        System.out.println("El carro se recarga con gasolina.");
    }
}
