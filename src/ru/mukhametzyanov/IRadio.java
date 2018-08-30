package ru.mukhametzyanov;

public class IRadio extends Radio {
    private String[] iRadio = new String[]{"Маяк", "Наука", "Шутка"};

    @Override
    protected String getRadio(int key) {
        return this.iRadio[key];
    }
}
