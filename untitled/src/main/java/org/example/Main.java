package org.example;

//import Controller.UsuarioController;
//import View.UsuarioView;
//
//public class Main {
//    public static void main(String[] args){
//        UsuarioView view = new UsuarioView();
//        UsuarioController controller = new UsuarioController(view);
//
//        controller.cadastrarUsuario();
//    }
//}

import Controller.DiagnosticoController;
import View.DiagnosticoView;

public class Main {
    public static void main(String[] args) {
        DiagnosticoController controller = new DiagnosticoController();
        DiagnosticoView view = new DiagnosticoView(controller);
        view.menu();
    }
}