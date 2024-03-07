
public class exercicio5 {
    public static void main(String[] args) {
        String texto = "Texto para ser revertido";
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado = resultado.concat(String.valueOf(texto.charAt(i)));

        }
        System.out.println(resultado);
    }    
}