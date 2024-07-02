package eletronicos.models;

import eletronicos.interfaces.IEeletrodomestico;

public class Ventilador implements IEeletrodomestico {
    private String marca;
    private String modelo;
    private int potencia;
    private int velocidadeAtual;
    private boolean estaLigado;
    private int velocidadeMaxima;

    public Ventilador(String marca, String modelo, int potencia, int velocidadeAtual, boolean estaLigado,
            int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadeAtual = velocidadeAtual;
        this.estaLigado = estaLigado;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Ventilador() {
        this.marca = "Arno";
        this.modelo = "Turbo Silence";
        this.potencia = 120;
        this.velocidadeAtual = 0;
        this.estaLigado = false;
        this.velocidadeMaxima = 3; 
    }

    @Override
    public void ligar() {
        this.estaLigado = true;
        this.velocidadeAtual = 1;
        System.out.println("Ventilando na velocidade: " + this.velocidadeAtual);
    }

    @Override
    public void desligar() {
        this.estaLigado = false;
        this.velocidadeAtual = 0;
        System.out.println("Parando a ventilação. Velocidade atual: " + this.velocidadeAtual);
    }

    public void aumentarVelocidade() {
        if (!this.estaLigado) {
            System.out.println("Você precisa primeiro ligar o ventilador para aumentar sua velocidade...");
            return;
        }
        if (this.velocidadeAtual == this.velocidadeMaxima) {
            System.out.println("Velocidade maxima ja foi atingida.");
            return; 
        }
        this.velocidadeAtual += 1;
        System.out.println("Ventilando na velodiade:" + this.velocidadeAtual);
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
