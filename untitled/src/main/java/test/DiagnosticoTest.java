package test;

import Controller.DiagnosticoController;
import Model.Diagnostico;
import org.junit.*;

import java.util.List;

public class DiagnosticoTest {

    @Test
    public void testCadastroAnimalEDiagnostico() {
        DiagnosticoController controller = new DiagnosticoController();
        controller.cadastrarAnimal("Bidu", "Cachorro", 4);
        controller.registrarDiagnostico("Bidu", "Febre e tosse");

        List<Diagnostico> diagnosticos = controller.listarDiagnosticos();
        assertEquals(1, diagnosticos.size());
        assertEquals("Bidu", diagnosticos.get(0).getAnimal().getNome());
        assertEquals("Febre e tosse", diagnosticos.get(0).getDescricao());
    }

    @Test
    public void testDiagnosticoDeAnimalInexistente() {
        DiagnosticoController controller = new DiagnosticoController();
        controller.registrarDiagnostico("Rex", "Sem apetite");
        List<Diagnostico> diagnosticos = controller.listarDiagnosticos();
        assertEquals(0, diagnosticos.size());
    }
}

