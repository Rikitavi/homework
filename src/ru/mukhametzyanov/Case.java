package ru.mukhametzyanov;

public class Case extends Disk {
    private String[] side = new String[]{"Правая сторона", "Левая сторона"};


    @Override
    protected String getDisk(int side) {
        return this.side[side];
    }
}
