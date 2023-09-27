package br.com.aula.projetoestacionamento.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import java.util.TimeZone;

@Configuration
public class SpringTimeZoneConfig {

    @PostConstruct
    public void timezoneconfig(){

        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
}