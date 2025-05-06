package View;

import java.util.Scanner;

public class UsuarioView {
    private Scanner scanner;

    public UsuarioView(){
        scanner = new Scanner(System.in);
    }

    public String solicitarNome(){
        System.out.println("Digite a idade do usuario: ");
        return scanner.nextLine();
    }

    public int solicitarIdade(){
        System.out.println("Digite a idade do usuario: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
