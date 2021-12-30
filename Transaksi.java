public class Transaksi{
    private Pembeli pembeli;
    private Kasir kasir;
    private Barang barang;
    private int jmlBarang;
    private double subTotal;
    private double total;

    public Transaksi(Pembeli pembeli, Kasir kasir, Barang barang, int jmlBarang){
        this.pembeli = pembeli;
        this.kasir = kasir;
        this.barang = barang;
        this.jmlBarang = jmlBarang;
    }

    public Pembeli getPembeli(){
        return pembeli;
    }

    public Kasir getKasir(){
        return kasir;
    }

    public Barang getBarang(){
        return barang;
    }

    public int getJmlBarang(){
        return jmlBarang;
    }

    public double getSubTotal(){
        return barang.getHarga() * getJmlBarang();
    }

    public void info(){
        System.out.println("Nama Barang     : "+barang.getNamaBarang());
        System.out.println("Jumlah Barang   : "+getJmlBarang());
        System.out.println("Sub Harga       : "+getSubTotal());
    }
}