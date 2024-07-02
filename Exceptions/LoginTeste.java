import java.util.Scanner;

public class LoginTeste {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginException{
        Scanner sc = new Scanner(System.in);
        
        String user = "user";
        String password = "1234";
        
        System.out.println("Usuario: ");
        String userDigit = sc.nextLine();

        System.out.println("Senha: ");
        String passDigit = sc.nextLine();

        if (!user.equals(userDigit) || !password.equals(passDigit)) {
            throw new LoginException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso!");
    }
        
}



