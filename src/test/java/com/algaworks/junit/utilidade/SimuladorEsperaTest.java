package com.algaworks.junit.utilidade;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.Duration;

class SimuladorEsperaTest {

    @Test
    @Disabled
    void esperar() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    public void deveEsperarENaoDarTimeout() {
        //Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")), () -> "Teste ignorado, nao deve ser executado em PRODUÇAO");
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
    }
}