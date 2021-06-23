package Model;

public class DataPeminjam {
    private String noTlp;
    private String Nama;
    private String noPinjam;

    public void data01() {
        System.out.println("noTlp : " + noTlp);
        System.out.println("name : " + Nama);
        System.out.println("noPinjam : " + noPinjam);
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }

    public String getName() {
        return Nama;
    }

    public void setName(String nama) {
        this.Nama = nama;
    }

    public String getNoPinjam() {
        return noPinjam;
    }

    public void setNoPinjam(String noPinjam) {
        this.noPinjam = noPinjam;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


