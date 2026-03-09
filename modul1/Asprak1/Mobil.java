public class Mobil { 
 private String nopol; 
 private String warna; 
 private String merk; 
 private int kecepatan;
 private double jaraktempuh;
 private double waktu;
 private double ubahkpjtomps;
  
 public void setNopol(String n) { 
 nopol = n; 
 } 
 public void setWarna(String s) { 
 warna = s; 
 } 
 public void setMerk(String m) { 
 merk = m; 
 } 
 public void setKecepatan(int k) { 
 kecepatan = k;
 }
 public void setWaktu(double w){
   waktu = w;
 }
 public void setJaraktempuh(int k, double w) {
    jaraktempuh = (k * w); 
} 
  public void ubahkpjtomps(int k) {
    ubahkpjtomps = (k * (5/18.0));
  }
 public void display() { 
 System.out.println("Mobil bermerk " + merk); 
 System.out.println("bernomor polisi " + nopol); 
 System.out.println("serta memililki warna " + warna); 
 System.out.println("bergerak dengan kecepatan " + kecepatan );
 System.out.println("Jarak tempuh: " + jaraktempuh + "kpj");
 System.out.println("Jarak tempuh dalam meter per second: " + ubahkpjtomps + " m/s");  } 
 }