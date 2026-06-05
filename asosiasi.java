import java.util.ArrayList;

abstract class Orang {
    private String nama;
    public Orang(String nama) {
    this.nama = nama;
    }
    public String getName() {
    return nama;
    }
    public abstract void tampilkanPeran();
}
