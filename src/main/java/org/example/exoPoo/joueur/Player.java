package org.example.exoPoo.joueur;

public class Player {
    private String charName;
    private int levelChar;
    private double currentXpChar;
    private double totalXpChar=0;
    private double nextLevelsXpRequired = 100;
    private int mobSlain=0;
    private int questAccomplished = 0;
    private double nextLevelXpLeft = nextLevelsXpRequired;


    public Player(String charName) {
        this.charName = charName;
        this.levelChar = 1;
        this.currentXpChar = 0;
    }

    private double levelXpRequired(){
        return levelChar*1.2*100;
    }

    public void questRewards(){
        currentXpChar+= 25;
        totalXpChar+=25;
        questAccomplished++;
        nextLevelXpLeft= nextLevelsXpRequired-currentXpChar;
        levelUp();
    }
    public void mobBashing(){
        currentXpChar+= 10;
        totalXpChar+=10;
        mobSlain++;
        nextLevelXpLeft= nextLevelsXpRequired-currentXpChar;
        levelUp();
    }

    private double nextLevelsXpLeft(){
        return levelXpRequired() - currentXpChar;
    }

        private void levelUp(){
            nextLevelsXpRequired=levelXpRequired();
                if (currentXpChar >= nextLevelsXpRequired){
                      levelChar++;
                      currentXpChar=0;
        }
            nextLevelsXpRequired=levelXpRequired();

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
        return "Player{" +
                "charName='" + charName + '\'' +
                ", levelChar=" + levelChar +
                ", currentXpChar=" + currentXpChar +
                ", totalXpChar=" + totalXpChar +
                ", nextLevelsXpRequired=" + nextLevelsXpRequired +
                ", mobSlain=" + mobSlain +
                ", questAccomplished=" + questAccomplished +
                ",nextLevelXpLeft ="+nextLevelXpLeft+
                '}';
    }
}
