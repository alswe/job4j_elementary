package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
         another.load += this.load;
         this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(1000);
        Battery battery2 = new Battery(100);

        System.out.println("Load of the battery #1 is " + battery1.load);
        System.out.println("Load of the battery #2 is " + battery2.load);

        battery1.exchange(battery2);

        System.out.println("Load of the battery #1 is " + battery1.load);
        System.out.println("Load of the battery #2 is " + battery2.load);
    }
}
