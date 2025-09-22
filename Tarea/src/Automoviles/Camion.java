package Automoviles;

import Vehiculos.Vehiculo;
import vehiculointerfaz.Combustible;

public class Camion extends Vehiculo implements Combustible {

    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El camión transporta carga pesada por la autopista.");
    }

    @Override
    public void recargar() {
        System.out.println("El camión se recarga con diésel.");
    }
}

