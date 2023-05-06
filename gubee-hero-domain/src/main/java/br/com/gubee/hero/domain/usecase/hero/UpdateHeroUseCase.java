package br.com.gubee.hero.domain.usecase.hero;

import br.com.gubee.hero.domain.api.hero.UpdateHero;
import br.com.gubee.hero.domain.model.hero.Hero;
import br.com.gubee.hero.domain.spi.hero.HeroRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateHeroUseCase implements UpdateHero {
    private final HeroRepository heroRepository;

    @Override
    public Hero updateHero(Hero hero) {
        return heroRepository.updateHero(hero);
    }
}
