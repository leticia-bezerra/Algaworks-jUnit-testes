package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void assercaoAgrupada(){
        Pessoa pessoa = new Pessoa("João", "Silva");
//        assertEquals("João", pessoa.getNome());
//        assertEquals("Silva", pessoa.getSobrenome());

        assertAll("Assercoes de pessoa",
                () -> assertEquals("João", pessoa.getNome()),
                () -> assertEquals("Silva", pessoa.getSobrenome()),
                () -> assertEquals("João Silva", pessoa.getNomeCompleto())
        );

    }

}