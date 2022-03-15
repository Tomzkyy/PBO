package week2;

public class Lampu {

    String Warna;
    String Merk;
    Boolean status;

    public Lampu() {
    }

    void NyalakanLampu() {
        if (status == false) {
            System.out.println("Apakah lampu menyala? true");
            status = true;
        } else {
            System.out.println("Lampu sudah menyala");
        }
    }

    void MatikanLampu() {
        if (status == true) {
            System.out.println("Apakah lampu mati? false");
            status = false;
        } else {
            System.out.println("Lampu sudah mati");
        }
    }
}

class AksiLampu {

    public static void main(String[] args) {
        Lampu LampuKu = new Lampu();
        LampuKu.Warna = "Putih";
        LampuKu.Merk = "Philips";
        System.out.println("Lampu berwana " + LampuKu.Warna + " bermerk " + LampuKu.Merk);
        LampuKu.status = false;
        LampuKu.NyalakanLampu();
        LampuKu.MatikanLampu();
    }
}