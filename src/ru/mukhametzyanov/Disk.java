package ru.mukhametzyanov;

public class Disk {

    private String[] disk = new String[]{"Правая сторона", "Левая сторона"};

    protected String getDisk(int side) {
        return this.disk[side];
    }

    public void GiveDisk(int side) {
        if (side > this.disk.length) {
            System.out.println("Ошибка");
        } else {
            String disk = getDisk(side);
            System.out.println("Играет " + disk);
        }
    }
}

