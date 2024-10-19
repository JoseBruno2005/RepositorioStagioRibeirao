package main;

import domain.CalculadoraFibonacci;

public class Main {
    public static void main(String[] args) {

        var calculadora = new CalculadoraFibonacci();

        System.out.println(calculadora.calcularFibonacci(5));

    }
}
