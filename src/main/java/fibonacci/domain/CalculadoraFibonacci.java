package fibonacci.domain;

import java.util.ArrayList;

public class CalculadoraFibonacci {
    public ArrayList<Integer> calcularFibonacci(int n) {
        ArrayList<Integer> senquenciaFibonacci = new ArrayList<>();
        int a = 0;
        int b = 1;
        senquenciaFibonacci.add(a);

        while (b <= n) {
            senquenciaFibonacci.add(b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        return senquenciaFibonacci;
    }
}
