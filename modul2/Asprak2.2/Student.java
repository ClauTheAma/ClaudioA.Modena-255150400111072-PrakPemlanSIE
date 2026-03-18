public class Student { 
 private String nama; 
 private int skor; 
  
 public Student(String nama) { 
 this.nama = nama; 
 }
 
 public static void setNama(Student std, String nama) {
   std.nama = nama;
 }

 public String getNama() {
    return this.nama;
 }

 private void setNama(String nama) { 
 this.nama = nama; 
 } 
 public int getSkor() { 
 return this.skor; 
 } 
}
