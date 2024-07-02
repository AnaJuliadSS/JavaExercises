package geometry;

import geometry.models.Circulo;
import geometry.models.Retangulo;
import geometry.models.Triangulo;

public class App {
    public static void main(String[] args) {
        System.out.println("Areas calculadas(valores arredondados):");
        Circulo circulo = new Circulo(); 
        System.out.println("Circulo: " +  Math.round(circulo.calculaArea()));

        Retangulo retangulo = new Retangulo();
        System.out.println("Retangulo: " + Math.round(retangulo.calculaArea()));

        Triangulo triangulo = new Triangulo();
        System.out.println("Triangulo: " + Math.round(triangulo.calculaArea()));
    }
}
