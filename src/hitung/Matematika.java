
package hitung;

public class Matematika {
    double bil1,bil2,hasil;
    
    public Matematika(double bil1,double bil2){
        this.bil1=bil1;
        this.bil2=bil2;
        this.hasil=hasil;
    }
    
    void setPenjumlahan(double bil1, double bil2){
       hasil = bil1 + bil2;
        System.out.println("Hasil: " + hasil);
}
    double getPenjumlahan(){
        return hasil;
    }
}
