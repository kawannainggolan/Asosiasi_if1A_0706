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

class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    }

    public String getInfo() {
    return kode + " " + nama + " (" + sks + " SKS)";
    }
}

class Dosen extends Orang {
    private String nidn;
    private ArrayList<Matakuliah> mataKuliahDijajar;

    public Dosen(String nama, String nidn) {
    this.nidn = nidn;
    this.mataKuliahDijajar = new ArrayList<>();
    }

    public void tampilkanDijajar() {
    System.out.println(getNama() + " berperan sebagai Dosen.");
    }

    public void tampilkanMatakuliahDijajar() {
    System.out.println("Dosen : " + getNama());
    System.out.println("NIDN : " + nidn);
    System.out.println("Mata Kuliah yang Dijajar:");
    for (Matakuliah mk : mataKuliahDijajar) {
    System.out.println("-- " + mk.getInfo());
    }
    }
}

    class Mahasiswa extends Orang {
    private String nidn;
    private ArrayList<Matakuliah> mataKuliahDiambil;

    public Mahasiswa(String nama, String nidn) {
    super(nama);
    this.nidn = nidn;
    this.mataKuliahDiambil = new ArrayList<>();
    }

    public void tampilkanMatakuliah() {
    System.out.println(getNama() + " berperan sebagai Mahasiswa.");
    }

    public void tampilkanPeran() {
    System.out.println(getNama() + " berperan sebagai Mahasiswa.");
}
}
