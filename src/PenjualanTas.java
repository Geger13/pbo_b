public class PenjualanTas {

    private final String nama;
    private static int qty;
    private final int harga;

    public PenjualanTas(String nama, int harga){
        this.nama = nama;
        this.harga = harga;

    }
    public static void setQty(int qty){
        PenjualanTas.qty = qty;

    }

    public void struk(){
        int total = qty * harga;
        System.out.println("Nama tas = "+nama);
        System.out.println("QTY = "+qty);
        System.out.println("Harga = "+harga);
        System.out.println("Total harga = "+total);

        return ;
    }

}
