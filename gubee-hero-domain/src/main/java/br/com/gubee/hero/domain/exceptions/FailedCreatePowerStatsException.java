package br.com.gubee.hero.domain.exceptions;

public class FailedCreatePowerStatsException extends RuntimeException{
    public FailedCreatePowerStatsException(){
        super("There was an error creating Power Stats, try again!");
    }
}
