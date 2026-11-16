package br.edu.conversor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void pontoDeCongelamentoFparaC() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32), 0.001);
    }

    @Test
    void pontoDeEbulicaoFparaC() {
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    void pontoDeCongelamentoCparaF() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0), 0.001);
    }

    @Test
    void menos40EhIgualNasDuasEscalas() {
        assertEquals(-40.0, conversor.celsiusParaFahrenheit(-40), 0.001);
    }
}
