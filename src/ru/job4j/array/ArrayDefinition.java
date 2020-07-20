package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "John Doe";
        names[1] = "Jack Daniels";
        names[2] = "Sonya Blade";
        names[3] = "Elisabeth Simpson";
        for (String i : names) {
            System.out.println(i);
        }
    }

}
