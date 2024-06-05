
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika maya = new Matematika(4,7);
        
        System.out.println("Rumus Matematika");
        System.out.println("Penjumlahan: "+ maya.setPenjumlahan());
        System.out.println("Pengurangan: "+ maya.setPengurangan());
        System.out.println("Perkalian: "+ maya.setPerkalian());
        System.out.println("Pembagian: "+ maya.setPenjumlahan());
    }
}
