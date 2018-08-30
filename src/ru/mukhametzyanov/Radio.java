package ru.mukhametzyanov;


public class Radio {

    private String[] radio = new String[]{"Рекорд", "DFM", "Европа Плюс"};


    protected String getRadio(int key) {
        return this.radio[key];
    }

    public void GiveRadio(int key) {
        if (key > radio.length){
            System.out.println("Такой радиостанции нет!");
        } else {
            String radio = getRadio(key);
            System.out.println("Играет радио: " + radio);
        }
    }
}

