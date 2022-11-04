public class bus {
    private int jumlahpenumpang;
    private int kapasitas;

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getJumlahpenumpang() {
        return jumlahpenumpang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setNaik(int penumpang) {
        jumlahpenumpang = jumlahpenumpang + penumpang;
        if (jumlahpenumpang > kapasitas){
            jumlahpenumpang = kapasitas;
        }

    }
    public void setTurun(int penumpang) {
        jumlahpenumpang = jumlahpenumpang - penumpang;
        if (jumlahpenumpang < 0 ){
            jumlahpenumpang = 0;
        }

    }


    }

