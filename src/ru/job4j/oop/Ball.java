package ru.job4j.oop;

public class Ball {
    private boolean isDead = false;

    public boolean getIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public void result() {
        if(this.isDead) {
            System.out.println("Ball, R.I.P.");
        } else {
            System.out.println("Ball, live long!");
        }
    }
}
