/*
 * @author Rick van den Berg
 */
package sefyscorendon;

import javafx.beans.property.SimpleStringProperty;

public class Tabeldata {

    final SimpleStringProperty naam;
    final SimpleStringProperty merk;
    final SimpleStringProperty kleur;
    final SimpleStringProperty gewicht;

    public Tabeldata(String Naam, String Merk, String Kleur, String Gewicht) {

        this.naam = new SimpleStringProperty(Naam);
        this.merk = new SimpleStringProperty(Merk);
        this.kleur = new SimpleStringProperty(Kleur);
        this.gewicht = new SimpleStringProperty(Gewicht);
    }

    public String getNaam() {
        return naam.get();
    }

    public void setNaam(String Naam) {
        naam.set(Naam);
    }

    public String getMerk() {
        return merk.get();
    }

    public void setMerk(String Merk) {
        merk.set(Merk);
    }

    public String getKleur() {
        return kleur.get();
    }

    public void setKleur(String Kleur) {
        kleur.set(Kleur);
    }

    public String getGewicht() {
        return gewicht.get();
    }

    public void setGewicht(String Gewicht) {
        gewicht.set(Gewicht);
    }

}
