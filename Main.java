import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilih, umur;
        String nama, alamat;
        
        // instance of class
        
        Kasir sir = new Kasir("Yoga", "Mojokerto", 19);

        Kategori kt1 = new Makanan();
        Kategori kt2 = new Minuman();
        Barang bar[] = new Barang[6];
        bar[0] = new Barang("Oreo", 3000, kt1);
        bar[1] = new Barang("Chitato", 6000, kt1);
        bar[2] = new Barang("Pocky", 8000, kt1);
        bar[3] = new Barang("Coca Cola", 5000, kt2);
        bar[4] = new Barang("Nescafe", 6000, kt2);
        bar[5] = new Barang("Freshtea", 4000, kt2);


        while(true){
            // Menu
            System.out.println("\n========== MINIMART ==========\n");
            System.out.println("1. Kasir");
            System.out.println("2. Barang");
            System.out.println("3. Transaksi");

            // Input
            System.out.print("\nMasukkan pilihan anda : ");
            pilih = sc.nextInt();
            

            // Proses + Output
            switch(pilih){
                case 1:
                    sir.info();
                break;

                case 2:
                    System.out.println("\n----- BARANG -----");
                    for (int i = 0; i < bar.length; i++){
                        bar[i].info();
                    }
                break;

                case 3:
                    System.out.println("\n----- PEMBELI -----");
                    System.out.print("Masukkan nama   : ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Masukkan alamat : ");
                    alamat = sc.nextLine();
                    System.out.print("Masukkan umur   : ");
                    umur = sc.nextInt();
                    System.out.println("\n----- TRANSAKSI -----");
                    Pembeli bel = new Pembeli(nama, alamat, umur);
                    bel.info();
                    Transaksi tr[] = new Transaksi[4];
                    tr[0] = new Transaksi(bel, sir, bar[0], 2);
                    tr[1] = new Transaksi(bel, sir, bar[2], 1);
                    tr[2] = new Transaksi(bel, sir, bar[3], 3);
                    tr[3] = new Transaksi(bel, sir, bar[4], 1);
                    for (int i = 0; i < tr.length; i++){
                        tr[i].info();
                    }

                    double total = 0;
                    for(int i=0; i<tr.length;i++){
                        total += tr[i].getSubTotal();
                    }

                    System.out.println("Harga Total     : " +total);
                break;

                default:
                    System.out.println("Input an anda salah !!!\n");
                System.exit(0);
            }
        }
    }
}