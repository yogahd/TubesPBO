public class Barang{
    private String namaBarang;
    private double harga;
    private Kategori kategori;

    public Barang(String namaBarang, double harga, Kategori kategori){
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNamaBarang(){
        return namaBarang;
    }

    public double getHarga(){
        return harga;
    }

    public Kategori getKategori(){
        return kategori;
    }

    public void info(){
        System.out.println("Nama Barang     : "+getNamaBarang());
        System.out.println("Harga           : "+getHarga());
        if(kategori instanceof Makanan){
            ((Makanan)kategori).ciri();
        }else{
            ((Minuman)kategori).ciri();
        }
    }
}