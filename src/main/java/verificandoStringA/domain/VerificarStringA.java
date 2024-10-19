package verificandoStringA.domain;

public class VerificarStringA {
    public String verificarStringA(String palavra){
        int contadorA = 0;
        for (char a : palavra.toCharArray()){
            if(a == 'a' || a == 'A'){
                contadorA ++;
            }
        }
        if (contadorA > 0) {
            return "A letra a aparece " + contadorA + " vezes na string.";
        } else {
            return "A letra a não aparece na string.";
        }
    }
}
