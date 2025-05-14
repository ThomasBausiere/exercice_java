package org.example.exoPoo.film;

public class Film {
    public String titre, realisateur, genre;
    public int date;

    public Film(String titre, String realisateur, String genre, int date) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.genre = genre;
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String toString(){
        return "Film {" + '\n'
                + '\t'+"titre "+ titre +"."+ '\n'
                + '\t'+"realisateur: "+ realisateur +"."+ '\n'
                + '\t'+"année de sortie: "+date +"."+ '\n'
                + '\t'+"genre: "+genre +"."+ '\n'
                +'}';
    }
}
