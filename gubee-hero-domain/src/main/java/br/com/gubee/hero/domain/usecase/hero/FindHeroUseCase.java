package br.com.gubee.hero.domain.usecase.hero;

import br.com.gubee.hero.domain.api.hero.FindHero;
import br.com.gubee.hero.domain.model.hero.Hero;
import br.com.gubee.hero.domain.spi.hero.HeroRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class FindHeroUseCase implements FindHero {

    private final HeroRepository heroRepository;

    @Override
    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    @Override
    public Hero findById(UUID id) {
        return heroRepository.findById(id);
    }

    @Override
    public Hero findByName(String name) {
        return heroRepository.findByName(name);
    }

}
