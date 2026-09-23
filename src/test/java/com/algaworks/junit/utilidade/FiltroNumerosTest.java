package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;


class FiltroNumerosTest {

    @Test
    public void deveRetornarApenasNumerosPares() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        List<Integer> numerosPares = Arrays.asList(2, 4, 6, 8);
        List<Integer> resultadoFiltro = FiltroNumeros.numerosPares(numeros);
        Assertions.assertIterableEquals(numerosPares, resultadoFiltro);
    }

    @Test
    void numerosImpares() {
    }

    @Test
    void isPositivo() {
    }
}