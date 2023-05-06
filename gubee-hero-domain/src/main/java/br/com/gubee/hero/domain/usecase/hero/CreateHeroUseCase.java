package br.com.gubee.hero.domain.usecase.hero;

import br.com.gubee.hero.domain.api.hero.CreateHero;
import br.com.gubee.hero.domain.exceptions.HeroAlreadyExistException;
import br.com.gubee.hero.domain.model.hero.Hero;
import br.com.gubee.hero.domain.spi.hero.HeroRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateHeroUseCase implements CreateHero {

    private final HeroRepository heroRepository;

    @Override
    public Hero create(Hero hero) {
        if (heroRepository.exist(hero.getName()))
            throw new HeroAlreadyExistException(hero.getName());
        return heroRepository.create(hero);
    }
}
