package View;

import Controller.DiagnosticoController;
import Model.Diagnostico;

import java.util.List;
import java.util.Scanner;

public class DiagnosticoView {
    private DiagnosticoController controller;
    private Scanner scanner = new Scanner(System.in);

    public DiagnosticoView(DiagnosticoController controller) {
        this.controller = controller;
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Registrar Diagnóstico");
            System.out.println("3. Listar Diagnósticos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> registrarDiagnostico();
                case 3 -> listarDiagnosticos();
            }
        } while (opcao != 0);
    }

    private void cadastrarAnimal() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Espécie: ");
        String especie = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        controller.cadastrarAnimal(nome, especie, idade);
        System.out.println("Animal cadastrado com sucesso!\n");
    }

    private void registrarDiagnostico() {
        System.out.print("Nome do Animal: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição do Diagnóstico: ");
        String descricao = scanner.nextLine();
        controller.registrarDiagnostico(nome, descricao);
        System.out.println("Diagnóstico registrado!\n");
    }

    private void listarDiagnosticos() {
        List<Diagnostico> lista = controller.listarDiagnosticos();
        if (lista.isEmpty()) {
            System.out.println("Nenhum diagnóstico registrado.\n");
        } else {
            for (Diagnostico d : lista) {
                System.out.println(d);
                System.out.println("----------------------");
            }
        }
    }
}