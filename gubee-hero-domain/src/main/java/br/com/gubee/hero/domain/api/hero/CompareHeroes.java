package br.com.gubee.hero.domain.api.hero;


import br.com.gubee.hero.domain.model.hero.ComparedHeroes;

public interface CompareHeroes {

    ComparedHeroes compareHeroes(String firstHeroName, String secondHeroName);
}
