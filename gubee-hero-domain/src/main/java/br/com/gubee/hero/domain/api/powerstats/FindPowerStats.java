package br.com.gubee.hero.domain.api.powerstats;

import br.com.gubee.hero.domain.model.powerstats.PowerStats;

import java.util.List;
import java.util.UUID;

public interface FindPowerStats {
    List<PowerStats> findAll();

    PowerStats findById(UUID id);
}
