
public class RunTimeException {
    public static void main(String[] args) {
        divisao(8, 2);
    
    }    
    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0");
        }
        return a/b;
        
    }
}