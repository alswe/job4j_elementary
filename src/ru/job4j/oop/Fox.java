package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball) {
        System.out.println("Poor Ball! He was eaten by Fox. He couldn't survive");
        ball.setIsDead(true);
    }
}
