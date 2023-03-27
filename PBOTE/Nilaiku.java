public class Nilaiku {
    public static void main(String[] args) {
        // Membuat objek Nilai
        Nilai nilaiku = new Nilai("Teshar", "12345", 80, 95, 87);
        
        // Menampilkan data nilai
        System.out.println("Nama: " + nilaiku.getNama());
        System.out.println("NIM: " + nilaiku.getNim());
        System.out.println("Nilai Tugas: " +nilaiku.getNilaiTugas());
        System.out.println("Nilai UTS: " + nilaiku.getNilaiUTS());
        System.out.println("Nilai UAS: " +nilaiku.getNilaiUAS());
        System.out.println("Nilai Huruf: " + nilaiku.getNilaiHuruf());
        System.out.println("Predikat: " + nilaiku.getPredikat());
    }
}