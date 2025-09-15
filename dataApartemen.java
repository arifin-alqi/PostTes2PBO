package Model;

public class dataApartemen {
    private int id;
    private String tipe;
    private int luas;
    private int hargaSewa;
    private int hargaJual;
    String status;

    public dataApartemen(int id, String tipe, int luas, int hargaSewa, int hargaJual, String status) {
        this.id = id;
        this.tipe = tipe;
        this.luas = luas;
        this.hargaJual = hargaJual;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }

    public void tampilkanInfo() {
        System.out.println("====================================");
        System.out.println("    ID Unit        : " + id);
        System.out.println("    Tipe Unit      : " + tipe);
        System.out.println("    Luas Unit      : " + luas + " m2");
        System.out.println("    Harga Sewa Unit: Rp " + hargaSewa + " Juta");
        System.out.println("    Harga Jual Unit: Rp " + hargaJual + " Juta");
        System.out.println("    Status Unit    : " + status);
        System.out.println("=====================================");
    }
}
