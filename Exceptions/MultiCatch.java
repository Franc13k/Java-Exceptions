public class MultiCatch {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
            /* Sintaxe para multi catchs
            OBS: Não pode ser utilizado com Exception que tenha a mesma linha de sucessão
             * catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException) {
             *  System.out.println("Dentro dos multi catchs");
             * }
             */
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
    }
}
