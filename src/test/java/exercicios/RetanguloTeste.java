package exercicios;

import exemplos.Quadrado;
import org.junit.jupiter.api.Test;

import static jdk.vm.ci.aarch64.AArch64.r1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
    @Test
    public void criarObjetoRetangulo() {
        retangulo r1 = new retangulo();
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoBase() {
        retangulo r1 = new retangulo();
        r1.base = 10.0;
        assertNotNull(r1.base);
    }

    @Test
    public void presencaAtributoAltura() {
        retangulo r1 = new retangulo();
        r1.altura = 15.0;
        assertNotNull(r1.altura);
    }

    @Test
    public void metodoCalcularPerimetro() {
        retangulo r1 = new retangulo();
        r1.base = 10.0;
        r1.altura = 15.0;
        Double valorEsperado = 50.0;
        Double valorObtido = r1.calcularperimetro();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularArea() {
        retangulo r1 = new retangulo();
        r1.base = 10.0;
        r1.altura = 15.0;
        Double valorEsperado = 150.0;
        Double valorObtido = r1.calculararea();
        assertEquals(valorEsperado, valorObtido);
    }
}
