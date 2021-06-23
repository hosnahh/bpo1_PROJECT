package Model;

import java.util.Date;

public class main {
    public static void main(String[] args) {

        Model.Perpustakaan buku1 = new Model.Perpustakaan();

        Model.Perpustakaan buku2 = new Model.Perpustakaan(001, "Ratna Sari", "malin kundang",
                "Jln.tulip", new Date());

        Model.Perpustakaan buku3 = new Model.Perpustakaan(012, "Udin", "Cinderella",
                "fiksi", new Date());

    }
}

