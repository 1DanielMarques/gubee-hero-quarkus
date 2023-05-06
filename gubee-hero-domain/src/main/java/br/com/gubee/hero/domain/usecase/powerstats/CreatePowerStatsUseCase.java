package br.com.gubee.hero.domain.usecase.powerstats;

import br.com.gubee.hero.domain.api.powerstats.CreatePowerStats;
import br.com.gubee.hero.domain.model.powerstats.PowerStats;
import br.com.gubee.hero.domain.spi.powerstats.PowerStatsRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreatePowerStatsUseCase implements CreatePowerStats {

    private final PowerStatsRepository powerStatsRepository;

    @Override
    public PowerStats create(PowerStats powerStats) {
        return powerStatsRepository.create(powerStats);
    }
}
