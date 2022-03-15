package week2;

public class Sepeda {

    String Jenis;
    String Merk;
    int JumlahRoda;
    int gear = 5;

    public Sepeda() {
    }

    void ngerem() {
        System.out.println("Sepeda direm");
    }
}

class AksiSepeda {

    public static void main(String[] args) {
        Sepeda Sepedaku = new Sepeda();
        Sepedaku.Jenis = "Ontel";
        Sepedaku.Merk = "Phoenix";
        Sepedaku.JumlahRoda = 2;
        System.out.println("Sepeda berjenis " + Sepedaku.Jenis + " bermerk " + Sepedaku.Merk +
                " memiliki jumlah roda " + Sepedaku.JumlahRoda);
        int gearSepeda = Sepedaku.gear;
        System.out.println("Jumlah gear " + gearSepeda);
        Sepedaku.ngerem();
    }
}