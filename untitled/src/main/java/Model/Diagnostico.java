package Model;

public class Diagnostico {
    private Animal animal;
    private String descricao;

    public Diagnostico(Animal animal, String descricao) {
        this.animal = animal;
        this.descricao = descricao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Animal: " + animal + "\nDiagnóstico: " + descricao;
    }
}