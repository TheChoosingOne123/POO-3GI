package com.tonnom.evenementmanager.observer;

public class EvenementObservable {
    public interface EvenementObservable {
    void ajouterObserver(ParticipantObserver o);
    void supprimerObserver(ParticipantObserver o);
    void notifierObservers(String message);
}

}
