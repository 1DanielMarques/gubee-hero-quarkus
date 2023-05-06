package br.com.gubee.hero.domain.usecase;

import br.com.gubee.hero.domain.api.hero.CreateHero;
import br.com.gubee.hero.domain.enums.Race;
import br.com.gubee.hero.domain.exceptions.HeroAlreadyExistException;
import br.com.gubee.hero.domain.exceptions.ResourceNotFoundException;
import br.com.gubee.hero.domain.model.hero.Hero;
import br.com.gubee.hero.domain.spi.hero.HeroRepository;
import br.com.gubee.hero.domain.spi.hero.HeroRepositoryStub;
import br.com.gubee.hero.domain.usecase.hero.CreateHeroUseCase;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CreateHeroUseCaseTest {

    private final HeroRepository heroRepository = new HeroRepositoryStub();
    private final CreateHero createHero = new CreateHeroUseCase(heroRepository);

    @Test
    void shouldCreateHeroAndReturnIt() throws ResourceNotFoundException {
        //given
        var hero = Hero.builder()
                .name("Batman")
                .race(Race.HUMAN)
                .powerStatsId(UUID.randomUUID())
                .build();
        //when
        var heroSaved = createHero.create(hero);
        //then
        var heroFound = heroRepository.findById(heroSaved.getId());
        assertEquals(heroFound, heroSaved);
    }

    @Test
    void shouldThrowExceptionIfHeroAlreadyExist() {
        //given
        heroRepository.create(Hero.builder()
                .name("BATMAN")
                .race(Race.HUMAN)
                .build());
        //when
        var exception = assertThrows(HeroAlreadyExistException.class, () -> createHero.create(Hero.builder()
                .name("BATMAN")
                .race(Race.ALIEN)
                .build()));
        //then
        assertEquals("Hero BATMAN already exist", exception.getMessage());
    }


}
