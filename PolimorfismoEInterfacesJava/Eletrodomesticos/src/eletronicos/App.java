package eletronicos;

import eletronicos.models.Cafeteira;
import eletronicos.models.Televisao;
import eletronicos.models.Ventilador;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Cafeteira: \n");
        Cafeteira cafeteira = new Cafeteira();
        cafeteira.ligar();
        cafeteira.desligar();

        System.out.println("\n\n");

        System.out.println("Ventilador: \n");
        Ventilador ventilador = new Ventilador();
        ventilador.aumentarVelocidade();
        ventilador.ligar();
        ventilador.aumentarVelocidade();
        ventilador.aumentarVelocidade();
        ventilador.aumentarVelocidade();
        ventilador.aumentarVelocidade();
        ventilador.desligar();

        System.out.println("Televisao: \n");
        Televisao televisao = new Televisao();
        televisao.avancarCanal();
        televisao.ligar();
        televisao.avancarCanal();
        televisao.avancarCanal();
        televisao.avancarCanal();
        televisao.avancarCanal();
        televisao.voltarCanal();
        televisao.desligar();

    }
}
