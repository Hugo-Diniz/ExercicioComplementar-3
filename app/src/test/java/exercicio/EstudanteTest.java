package exercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {
    @Test
    void testeNome() {
        Estudante estudante = new Estudante("Antonio", 20230, 8.5, 7.0, 7.9);
        
        //Verificando se o nome do estudante vai ser igual o da instanciação
        String nome = estudante.getNome();
        assertEquals("Antonio", nome);

        //Verificando o metodo de redefinir o nome
        estudante.setNome("Hugo");
        assertEquals("Hugo", estudante.getNome());

    }

    @Test
    void testeMatricula() {
        Estudante estudante = new Estudante("Antonio", 20230, 8.5, 7.0, 7.9);
        
        //Verificando se a matricula do estudante vai ser igual o da instanciação
        assertEquals(estudante.getMatricula(), 20230);
        
        //Verificando o metodo de redefinir matricula
        estudante.setMatricula(12345);
        assertEquals(12345, estudante.getMatricula());
    }
    
    @Test
    void testeNotas() {
        Estudante estudante = new Estudante("Antonio", 20230, 8.5, 7.0, 7.9);

        assertEquals(8.5, estudante.getNota1());
        assertEquals(7.0, estudante.getNota2());
        assertEquals(7.9, estudante.getNota3());

        assertThrows(NotaInvalidaException.class, () -> {
            estudante.setN1(-2.5);
        });

        assertThrows(NotaInvalidaException.class, () -> {
            estudante.setN2(-1.5);
        });

        //Teste para caso a nota seja maior do que 10 também (facultativo)
        assertThrows(NotaInvalidaException.class, () -> {
            estudante.setN3(11);
        });

        assertDoesNotThrow(() -> estudante.setNotas(9.0, 7.5, 6.3));
        assertEquals(9.0, estudante.getNota1());
        assertEquals(7.5, estudante.getNota2());
        assertEquals(6.3, estudante.getNota3());
        
        assertThrows(NotaInvalidaException.class, () -> {
            estudante.setNotas(10.0, -6.5, 8);
        });
        
        assertThrows(NotaInvalidaException.class, () -> {
            estudante.setNotas(10.0, 5, -6);
        });

        assertThrows(NotaInvalidaException.class, () -> {
            estudante.setNotas(-4.3, 1.2, 7.2);
        });

        assertThrows(NotaInvalidaException.class, () -> {
            estudante.setNotas(8, 13, 5);
        });

    }

    @Test
    void testeMedia() {
        Estudante estudante = new Estudante("Antonio", 20230, 8.5, 7.0, 7.9);

        assertEquals(7.8, estudante.getMedia(), 0.0001);

        assertDoesNotThrow(() -> estudante.setNotas(6.3, 10.0, 7.4));

        assertEquals(7.9, estudante.getMedia(), 0.0001);
    }

}
