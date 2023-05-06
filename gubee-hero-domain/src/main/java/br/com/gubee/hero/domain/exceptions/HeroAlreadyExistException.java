package br.com.gubee.hero.domain.exceptions;

public class HeroAlreadyExistException extends RuntimeException {
    public HeroAlreadyExistException(String name) {
        super("Hero " + name + " already exist");
    }
}