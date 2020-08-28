package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(0);
        song.music(1);
        song.music(33);
    }

    public void music(int position) {
        if (position == 0) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 1) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
