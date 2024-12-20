class Mobil {

    private int lokasi;

    private final int jumlahRoda = 4;

    public int getLokasi() {
        return this.lokasi;
    }

    public int getJumlahRoda() {
        return this.jumlahRoda;
    }

    public void jalan() {
        ++this.lokasi;
    }
}

public class Method {

    public static void main (String[] a) {
        Mobil car = new Mobil();

        car.jalan();

        System.out.println(car.getLokasi());
    }
}
