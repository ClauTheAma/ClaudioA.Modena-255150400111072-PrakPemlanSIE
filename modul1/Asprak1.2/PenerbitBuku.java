public class PenerbitBuku { 
 String nama; 
 String kota = "Malang"; 
 PenerbitBuku() { 
 this.nama = "Springer"; 
 } 
 PenerbitBuku(String nama) { 
 this.nama = nama; 
 } 
 PenerbitBuku(String nama, String kota) { 
 this.nama = nama; 
 this.kota = kota; 
 } 
 public void display() { 
 System.out.println("Penerbit " + nama); 
 System.out.println("di Kota " + kota); 
 } 
}