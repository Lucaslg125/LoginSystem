import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "password";

        System.out.println("Digite o nome de usuário: ");
        String inputUsername = scanner.nextLine();

        System.out.println("Digite a Sua Senha");
        String inputPassword = scanner.nextLine();

        if(inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login realizado com Sucesso.");
        }else{
            System.out.println("Nome de Usuário ou Senha Incorretos.");

        }
        scanner.close();
    }
}