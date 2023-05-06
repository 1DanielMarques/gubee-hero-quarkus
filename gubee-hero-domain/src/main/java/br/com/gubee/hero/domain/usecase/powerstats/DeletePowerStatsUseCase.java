package br.com.gubee.hero.domain.usecase.powerstats;

import br.com.gubee.hero.domain.api.powerstats.DeletePowerStats;
import br.com.gubee.hero.domain.spi.powerstats.PowerStatsRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class DeletePowerStatsUseCase implements DeletePowerStats {
    private final PowerStatsRepository powerStatsRepository;


    @Override
    public void deleteById(UUID id) {
            powerStatsRepository.deleteById(id);
    }
}
