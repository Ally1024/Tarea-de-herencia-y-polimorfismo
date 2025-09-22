package Automoviles;

import Vehiculos.Vehiculo;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("La moto se desplaza rápidamente entre el tráfico.");
       System.out.println("Y se recarga con gasolina");

    }
}

