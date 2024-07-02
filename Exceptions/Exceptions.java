import java.io.File;
import java.io.IOException;

public class  Exceptions {
        public static void main(String[] args) {
            newFile();
        }

        private static void newFile(){
            File file = new File("C:\\Users\\DARLIANE FERNANDES\\Documents\\FK\\teste.txt");
            try{
                boolean isCriado = file.createNewFile();
                System.out.println("Arquivo criado " + isCriado);
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    
}
