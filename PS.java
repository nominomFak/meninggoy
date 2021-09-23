class unitPs {
    String jenis_ps = "Playstation 3";
    String status = " Disewa";
    int seri = 3;
    int jumlah = 6;

    public void unitPs(String jenis_ps, int seri, int jumlah, String status) {
        this.jenis_ps = jenis_ps;
        this.seri = seri;
        this.jumlah = jumlah;
        this.status = status;
    }

    String getJenisPs() {
        return "Jenis PS : " + jenis_ps;
    }

    int getNoSeri() {
        return seri;
    }

    int getJumlahPs() {
        return jumlah;
    }

    String getStatusPs() {
        return "Status PS : " + status;
    }
}

class penyewa {
    String nama_penyewa = "Mansur";
    int usia = 20;

    public void penyewa(String nama_penyewa, int usia) {
        this.nama_penyewa = nama_penyewa;
        this.usia = usia;
    }

    String getNamaPenyewa() {
        return "Nama Penyewa : " + nama_penyewa;
    }

    int gettUsia() {
        return usia;
    }
}

public class PS {
    public static void main(String[] args) {
        unitPs Playstation = new unitPs();
        System.out.println("==============Rental PS=============");
        System.out.println(Playstation.getJenisPs());
        System.out.println("Nomor Seri : " + Playstation.getNoSeri());
        System.out.println("Jumlah : " + Playstation.getJumlahPs());
        System.out.println(Playstation.getStatusPs());
        System.out.println("__________________________________________");
        System.out.println("===============Penyewa==============");
        penyewa Penyewa = new penyewa();
        System.out.println(Penyewa.getNamaPenyewa());
        System.out.println("Usia Penyewa : " + Penyewa.gettUsia());
        System.out.println("__________________________________________");
    }

}