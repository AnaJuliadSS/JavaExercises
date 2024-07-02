package geometry.models;

import geometry.interfaces.IForma;

public class Circulo implements IForma {
    private double raio;
    private double circunferencia;

    public Circulo(double raio, double circunferencia) {
        this.raio = raio;
        this.circunferencia = circunferencia;
    }

    public Circulo() {
        this.raio = 5;
        this.circunferencia = 31.2;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public double calculaArea() {
        return Math.PI * this.raio * this.raio;
    }
}
