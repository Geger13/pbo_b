public class Main{
    public static void main(String[] args) {
        bus bus = new bus();

        bus.setKapasitas(50);
        bus.setNaik(30);
        bus.setTurun(10 );
        System.out.println("Jumlah penumpang adalah "+bus.getJumlahpenumpang()+" orang");
    }




}