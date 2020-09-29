package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element is not found");
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"Alex", "John", "Jessica"}, "Ben"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}