package ru.mukhametzyanov;


import java.util.Scanner;

public class Volume {
    private int[] volume = new int[101];
    Scanner sc = new Scanner(System.in);

    public void GiveMeVolume() {
        for (int i = 0; i < volume.length; i++) {
            System.out.println("Введите громкость: ");
            volume[i] = sc.nextInt();
            break;

        }
    }
}