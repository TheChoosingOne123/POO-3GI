package com.tonnom.evenementmanager.model;

public class Evenement {
    public abstract class Evenement implements EvenementObservable {
    private List<ParticipantObserver> observers = new ArrayList<>();

    public void ajouterObserver(ParticipantObserver o) {
        observers.add(o);
    }

    public void notifierObservers(String message) {
        for (ParticipantObserver o : observers) {
            o.recevoirNotification(message);
        }
    }

    public void annuler() {
        notifierObservers("Événement annulé : " + nom);
    }
}

}
