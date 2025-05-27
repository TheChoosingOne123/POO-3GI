package com.tonnom.evenementmanager.service;

public class GestionEvenements {
    @Test
void testEvenementExistant() {
    GestionEvenements gestion = GestionEvenements.getInstance();
    Evenement conf = new Conference(...);
    gestion.ajouterEvenement(conf);

    assertThrows(EvenementDejaExistantException.class, () -> {
        gestion.ajouterEvenement(conf);
    });
}


}
