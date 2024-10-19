package fibonacci.main;

import fibonacci.domain.CalculadoraFibonacci;
import fibonacci.domain.VerificarNumero;

public class Main {
    public static void main(String[] args) {
        var calculadora = new CalculadoraFibonacci();
        var verificarNumero = new VerificarNumero();

        System.out.println(verificarNumero.verificaFibonacci(calculadora.calcularFibonacci(10), 10));
    }
}
