package com.tonnom.evenementmanager.util;

public class JsonSerializer {
    @Test
void testSauvegardeChargementJson() throws IOException {
    List<Evenement> liste = List.of(new Concert(...));
    JsonSerializer.sauvegarder(liste, "evenements.json");

    List<Evenement> chargee = JsonSerializer.charger("evenements.json");
    assertEquals(liste.size(), chargee.size());
}

}
