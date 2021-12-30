public class Pembeli implements Identitas{
    private String nama;
    private String alamat;
    private int umur;

    public Pembeli(String nama, String alamat, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public int getUmur(){
        return umur;
    }

    public String memilikiKtp(){
        String msg = "";
        if(umur >= 17){
           msg = "Sudah memiliki KTP.";
        }else{
            msg = "Belum memiliki KTP.";
        }

        return msg;
    }

    public void info(){
        System.out.println("Nama            : "+getNama());
        System.out.println("Alamat          : "+getAlamat());
        System.out.println("Umur            : "+getUmur()+" Tahun dan "+ memilikiKtp()+"\n");
    }
}