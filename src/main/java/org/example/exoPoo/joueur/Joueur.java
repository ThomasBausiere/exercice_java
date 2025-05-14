package org.example.exoPoo.joueur;

public class Joueur {
    private String charName;
    private int levelChar;
    private double currentXpChar;
    private double nextLevelsXpRequired;


    public Joueur(String charName) {
        this.charName = charName;
        this.levelChar = 1;
        this.currentXpChar = 0;
        this.nextLevelsXpRequired = 100;

    }

    private double levelXpRequired(){
        return currentXpChar*1.2*100;
    }

    public void questRewards(){
        currentXpChar+= 25;
        levelUp();
    }
    private double nextLevelsXpLeft(){
        return levelXpRequired() - currentXpChar;
    }



        private void levelUp(){

            if(levelChar != 1){
                if (currentXpChar >=nextLevelsXpLeft()){
                    levelChar++;
            }else{
                    if(currentXpChar >= 100);
                    levelChar++;
                }
        }
    }


    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public double getCurrentXpChar() {
        return currentXpChar;
    }

    public void setCurrentXpChar(double currentXpChar) {
        this.currentXpChar = currentXpChar;
    }

    public int getLevelChar() {
        return levelChar;
    }

    public void setLevelChar(int levelChar) {
        this.levelChar = levelChar;
    }
    @Override
    public String toString() {
        return "Joueur{" +
                "charName='" + charName + '\'' +
                ", levelChar=" + levelChar +
                ", currentXpChar=" + currentXpChar +
                ", nextLevelsXpRequired=" + nextLevelsXpRequired +
                '}';
    }
}
