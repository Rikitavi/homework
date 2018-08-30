import ru.mukhametzyanov.*;

public class BumBox {
    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.GiveRadio(1);


        IRadio iRadio = new IRadio();
        iRadio.GiveRadio(2);


        Disk disk = new Disk();
        disk.GiveDisk(5);


        Case side = new Case();
        side.GiveDisk(1);


        Volume volume = new Volume();
        volume.GiveMeVolume();


    }
}
