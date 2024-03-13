package model;

import singleton.Guvern;

public class Main {
    public static void main(String[] args) {
        Guvern guvern = Guvern.getInstance(4, "Iohannis", 12);
        Guvern guvern2 = Guvern.getInstance(4, "Iohannis", 15);

        System.out.println(guvern.toString());
        System.out.println(guvern2.toString());
    }
}