package br.com.gubee.hero.domain.usecase.powerstats;

import br.com.gubee.hero.domain.api.powerstats.UpdatePowerStats;
import br.com.gubee.hero.domain.model.powerstats.PowerStats;
import br.com.gubee.hero.domain.spi.powerstats.PowerStatsRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdatePowerStatsUseCase implements UpdatePowerStats {
    private final PowerStatsRepository powerStatsRepository;

    @Override
    public PowerStats updatePowerStats(PowerStats powerStatsToUpdate) {
            return powerStatsRepository.updatePowerStats(powerStatsToUpdate);
    }
}
