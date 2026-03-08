import java.util.*;

public class App { 
 public static void main(String[] args) {  
 Scanner in = new Scanner(System.in);
    //instansiasi objek bernama m1 

int k = 100;
int w =20;
 Mobil m1 = new Mobil(); 
   m1.setMerk("Toyota");  
 m1.setNopol("AB 1231 UA");  
 m1.setWarna("Merah");
 m1.setKecepatan(k);
 m1.setJaraktempuh(k,w);
 m1.ubahkpjtomps(k); 
 m1.display(); 
 System.out.println("---------------");  
  
 //instansiasi objek bernama m2 
 Mobil m2 = new Mobil();  
  
 m2.setKecepatan(100); 
 m2.setMerk("Mitsubishi");  
 m2.setNopol("N 1134 AG");  
 m2.setWarna("Biru"); 
  m2.setKecepatan(k);
 m2.setJaraktempuh(k,w); 
  m2.ubahkpjtomps(k);
 m2.display(); 
 System.out.println("---------------");  
 System.out.println("Atribut pada objek m1 diubah."); 
 //mengubah warna dari objek m1 
 m1.setWarna("Hijau");  
  
 //menampilkan hasil perubahan  
 m1.display(); 
  in.close();
 }  
}