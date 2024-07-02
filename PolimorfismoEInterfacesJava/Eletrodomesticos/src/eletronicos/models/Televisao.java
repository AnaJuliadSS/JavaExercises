package eletronicos.models;

import eletronicos.interfaces.IEeletrodomestico;

public class Televisao implements IEeletrodomestico {
    private String marca;
    private String modelo;
    private int tamanhoPolegadas;
    private boolean estaLigada;
    private int canalAtual;

    public Televisao(String marca, String modelo, int tamanhoPolegadas, boolean estaLigada, int canalAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoPolegadas = tamanhoPolegadas;
        this.estaLigada = estaLigada;
        this.canalAtual = canalAtual;
    }

    public Televisao() {
        this.marca = "Samsung";
        this.modelo = "QLED";
        this.tamanhoPolegadas = 55;
        this.estaLigada = false;
        this.canalAtual = 10;
    }

    @Override
    public void ligar() {
        this.estaLigada = true;
        System.out.println("Ligando a televisão no canal: " + this.canalAtual + " de um total de 12 canais.");
    }

    @Override
    public void desligar() {
        this.estaLigada = false;
        System.out.println("Desligando a televisão. Ultimo canal acessado: " + this.canalAtual);
    }

    public void avancarCanal() {
        if (!this.estaLigada) {
            System.out.println("A televisão precisa estar ligada para avancar o canal...");
            return;
        }
        if (this.canalAtual >= 12) {
            this.canalAtual = 1;
        } else {
            this.canalAtual += 1;
        }
        System.out.println("Você avancou para o canal: "+ this.canalAtual);
    }

    public void voltarCanal() {
        if (!this.estaLigada) {
            System.out.println("A televisão precisa estar ligada para voltar o canal...");
            return;
        }
        if (this.canalAtual <= 1) {
            this.canalAtual = 12;
        } else {
            this.canalAtual -= 1;
        }
        System.out.println("Você voltou para o canal: "+ this.canalAtual);
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

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public boolean isEstaLigada() {
        return estaLigada;
    }

    public void setEstaLigada(boolean estaLigada) {
        this.estaLigada = estaLigada;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }
}
