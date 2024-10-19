package fibonacci.domain;

import java.util.ArrayList;

public class VerificarNumero {
    public String verificaFibonacci(ArrayList<Integer> senquenciaFibonacci, int numero) {
        System.out.println(senquenciaFibonacci);

        if (senquenciaFibonacci.contains(numero)) {
            return "O número " + numero + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + numero + " não pertence à sequência de Fibonacci.";
        }
    }
}
