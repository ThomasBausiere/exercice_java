package org.example.exoPoo.player;

public class Player {
    private String charName;
    private int  level =1;
    private int xp =0;

    public Player(String charName) {
        this.charName = charName;
    }

    public void questReward(){

    }



    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
