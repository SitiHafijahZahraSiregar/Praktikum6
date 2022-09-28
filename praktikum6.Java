package praktikum6ara;

public class Praktikum6Ara {

    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhsl = new Mahasiswa();
        mhsl.nama = "Siti Hafijah Zahra Siregar";
        mhsl.npm = "2157051005";
        
        mhsl.insertNilaiUas(90);
        mhsl.insertNilaiUts(90);            
        
        mhsl.dataMhs();
     
    }
    
}
