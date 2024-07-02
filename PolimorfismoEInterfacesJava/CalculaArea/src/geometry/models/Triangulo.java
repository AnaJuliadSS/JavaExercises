package geometry.models;

import geometry.interfaces.IForma;

public class Triangulo implements IForma {
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 10;
        this.altura = 10;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2;
    }
}
