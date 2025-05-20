package org.example.tpPapetterie.model;

public class Ramette extends ArticleUnitaire{
    private int grammage;

    public Ramette(String reference, String nom, double pu, int grammage) {
        super(reference, nom, pu);
        this.grammage = grammage;
    }

    public int getGrammage() {
        return grammage;
    }

    public void setGrammage(int grammage) {
        this.grammage = grammage;
    }

    @Override
    public String toString() {
        return  "Ramette :"+super.toString() + "  ramette de grammage: " + getGrammage();
    }

    @Override
    public double price(){
        return 0;
    }
}
