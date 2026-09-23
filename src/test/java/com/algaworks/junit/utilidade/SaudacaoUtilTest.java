package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudar() {
       String saudar = SaudacaoUtil.saudar(22);
        assertEquals("Boa noite", saudar, "Saudacao incorreta");
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