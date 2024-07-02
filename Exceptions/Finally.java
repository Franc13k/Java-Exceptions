public class Finally{
    public static void main(String[] args) {
        abreConex();
    }

    private static String abreConex(){
        try{
            System.out.println("Abrindo arquivo");
            return "conexao aberta";
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso...");
        }

        return null;
    }

}