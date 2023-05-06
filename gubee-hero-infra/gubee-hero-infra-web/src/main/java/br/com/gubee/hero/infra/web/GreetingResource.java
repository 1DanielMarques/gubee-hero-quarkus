package br.com.gubee.hero.infra.web;

import br.com.gubee.hero.domain.enums.Race;
import br.com.gubee.hero.domain.model.hero.Hero;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.Instant;
import java.util.UUID;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Hero batman = new Hero(UUID.randomUUID(), "Batman", Race.HUMAN, UUID.randomUUID(), Instant.now(), Instant.now(), true);
        return batman.toString();
    }
}
