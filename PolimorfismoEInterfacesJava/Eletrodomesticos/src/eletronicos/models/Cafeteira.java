package eletronicos.models;

import eletronicos.interfaces.IEeletrodomestico;

public class Cafeteira implements IEeletrodomestico{
    private double capacidadeDeAgua;
    private String marca;
    private String modelo;
    private double potencia;
    private boolean estaLigada;

    public Cafeteira(double capacidadeDeAgua, String marca, String modelo, double potencia, boolean estaLigada) {
        this.capacidadeDeAgua = capacidadeDeAgua;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.estaLigada = estaLigada;
    }

    public Cafeteira() {
        this.capacidadeDeAgua = 1.5;
        this.marca = "Nespresso";
        this.modelo = "Inissia";
        this.potencia = 1200;
        this.estaLigada = false;
    }

    @Override
    public void ligar() {
       this.estaLigada = true;
       System.out.println("Passando café...");
    }

    @Override
    public void desligar() {
        this.estaLigada = false;
        System.out.println("O café está pronto!");
    }

    public double getCapacidadeDeAgua() {
        return capacidadeDeAgua;
    }

    public void setCapacidadeDeAgua(double capacidadeDeAgua) {
        this.capacidadeDeAgua = capacidadeDeAgua;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isEstaLigada() {
        return estaLigada;
    }

    public void setEstaLigada(boolean estaLigada) {
        this.estaLigada = estaLigada;
    }
}
