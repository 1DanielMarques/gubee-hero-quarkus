package br.com.gubee.hero.domain.usecase.hero;

import br.com.gubee.hero.domain.api.hero.DeleteHero;
import br.com.gubee.hero.domain.spi.hero.HeroRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class DeleteHeroUseCase implements DeleteHero {

    private final HeroRepository heroRepository;

    @Override
    public void deleteById(UUID id) {
            heroRepository.deleteById(id);
    }

    @Override
    public void deleteByName(String name) {
        heroRepository.deleteByName(name);
    }

}
