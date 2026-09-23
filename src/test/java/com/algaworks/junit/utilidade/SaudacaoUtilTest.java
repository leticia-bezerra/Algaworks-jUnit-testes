package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudar() {
        String saudarDia = SaudacaoUtil.saudar(9);
        String saudarTarde = SaudacaoUtil.saudar(13);
        String saudarNoite = SaudacaoUtil.saudar(22);
        assertAll("Assercoes de pessoa",
        () -> assertEquals("Bom dia", saudarDia, "Saudacao incorreta"),
        () -> assertEquals("Boa tarde", saudarTarde, "Saudacao incorreta"),
        () -> assertEquals("Boa noite", saudarNoite, "Saudacao incorreta")
        );
    }

    @Test
    public void deveLancarException(){
        IllegalArgumentException msgException = assertThrows(IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(24));

        assertEquals(msgException.getMessage(), "Hora inválida");
    }

    @Test
    public void naoDeveLancarException(){
        assertDoesNotThrow(() -> SaudacaoUtil.saudar(0));
    }

}