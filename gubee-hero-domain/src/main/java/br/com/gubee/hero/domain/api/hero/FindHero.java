package br.com.gubee.hero.domain.api.hero;



import br.com.gubee.hero.domain.model.hero.Hero;

import java.util.List;
import java.util.UUID;

public interface FindHero {

    List<Hero> findAll();

    Hero findById(UUID id);

    Hero findByName(String name);

}
