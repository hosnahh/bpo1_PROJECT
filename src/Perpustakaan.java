package Model;

import java.util.Date;

public class Perpustakaan {
    private int noBuku;
    private int idAnggota;
    private String namaPeminjam;
    private String judulBuku;
    private String Alamat;
    private String JenisBuku;
    private Date tanggalPinjam;
    private Date tanggalBerakhir;


    public void dataPerpustakaan() {
        System.out.println("noBuku : " + noBuku);
        System.out.println("idAnggota : " + idAnggota);
        System.out.println("namaPeminjam : " + namaPeminjam);
        System.out.println("judulBuku : " + judulBuku);
        System.out.println("Alamat : " + Alamat);
        System.out.println("JenisBuku : " + JenisBuku);
        System.out.println("tanggalPinjam : " + tanggalPinjam);
        System.out.println("tanggalBerakhir : " + tanggalBerakhir);
    }

    public void ModelPerpustakaan() {

        System.out.println("Penjaga Perpus Sedang Mendata Buku");
    }

    public void dataPeminjam() {

        System.out.println("Peminjam Buku Diharuskan Mengsisi Formulir Terlebih dahulu");
    }

    public void jenisBuku() {

        System.out.println("Pemilihan Jenis Buku Oleh Pebjaga Perpus Untuk Setiap Rak nya");
    }

    public void idAnggota() {

        System.out.println("Setiap Peminjaman Harus Memiliki ID Anggota");
    }

    public Perpustakaan() {
    }

    public Perpustakaan(int idAnggota, String namaPeminjam, String judulBuku, String jenisBuku, Date tanggalBerakhir) {
        this.idAnggota = idAnggota;
        this.namaPeminjam = namaPeminjam;
        this.judulBuku = judulBuku;
        this.JenisBuku = jenisBuku;
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public Perpustakaan(int idAnggota, Date tanggalBerakhir) {
        this.idAnggota = idAnggota;
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public int getNoBuku() {
        return noBuku;
    }

    public void setNoBuku(int noBuku) {
        this.noBuku = noBuku;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getJenisBuku() {
        return JenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        JenisBuku = jenisBuku;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setTanggalBerakhir(Date tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
    }
}