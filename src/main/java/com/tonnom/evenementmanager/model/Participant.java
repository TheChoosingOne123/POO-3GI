package com.tonnom.evenementmanager.model;

public class Participant {
    public class Participant implements ParticipantObserver {
    @Override
    public void recevoirNotification(String message) {
        System.out.println(nom + " a reçu : " + message);
    }
}

}
