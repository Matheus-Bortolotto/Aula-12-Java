package Controller;

import Model.Animal;
import Model.Diagnostico;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticoController {
    private List<Animal> animais = new ArrayList<>();
    private List<Diagnostico> diagnosticos = new ArrayList<>();

    public void cadastrarAnimal(String nome, String especie, int idade) {
        animais.add(new Animal(nome, especie, idade));
    }

    public void registrarDiagnostico(String nomeAnimal, String descricao) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                diagnosticos.add(new Diagnostico(animal, descricao));
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    public List<Diagnostico> listarDiagnosticos() {
        return diagnosticos;
    }
}
