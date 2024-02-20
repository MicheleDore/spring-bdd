package fr.epsi.poec24.demospring.bo;

import java.io.Serializable;
import java.util.Objects;

public class Fournisseur implements Serializable {
    private int id;
    private String nom;

    public Fournisseur () {
        this(0, "");
    }

    public Fournisseur(String nom) {
        this(0, nom);
    }

    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fournisseur{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fournisseur that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
