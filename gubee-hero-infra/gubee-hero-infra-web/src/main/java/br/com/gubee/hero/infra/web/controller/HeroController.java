package br.com.gubee.hero.infra.web.controller;


import br.com.gubee.hero.infra.web.facade.HeroFacade;
import jakarta.ws.rs.Path;
import lombok.RequiredArgsConstructor;

@Path(value = "/api/hero")
@RequiredArgsConstructor
public class HeroController {

    private final HeroFacade heroFacade;
/*
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public HeroDTO create(@Valid @RequestBody HeroDTO heroToCreate) {
        var heroDTO = heroFacade.create(heroToCreate);
        return ResponseEntity.created(URI.create(format("/api/v1/heroes/%s", heroDTO.getId()))).body(heroDTO);
    }

    @GetMapping
    public ResponseEntity<List<HeroDTO>> findAll() {
        List<HeroDTO> heroDTOList = heroFacade.findAll();
        return ResponseEntity.ok().body(heroDTOList);
    }


    @GetMapping("/id/{id}")
    public ResponseEntity<HeroDTO> findById(@PathVariable(value = "id") UUID id) {
        var heroDTO = heroFacade.findById(id);
        return ResponseEntity.ok().body(heroDTO);
    }


    @GetMapping("/name/{name}")
    public ResponseEntity<HeroDTO> findByName(@PathVariable(value = "name") String name) {
        var heroDTO = heroFacade.findByName(name);
        return ResponseEntity.ok().body(heroDTO);
    }


    @PutMapping("/id/{id}")
    public ResponseEntity<HeroDTO> updateById(@PathVariable(value = "id") UUID id, @Validated @RequestBody HeroDTO heroToUpdate) {
        var heroDTO = heroFacade.updateById(id, heroToUpdate);
        return ResponseEntity.ok().body(heroDTO);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") UUID id) {
        heroFacade.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/name/{name}")
    public ResponseEntity<Void> deleteByName(@PathVariable(value = "name") String name) {
        heroFacade.deleteByName(name);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/compare/{firstHero}/with/{secondHero}")
    public ResponseEntity<ComparedHeroesDTO> compareHeroes(@PathVariable(value = "firstHero") String firstHero, @PathVariable(value = "secondHero") String secondHero) {
        return ResponseEntity.ok().body(heroFacade.compareHeroes(firstHero, secondHero));
    }

 */
}
