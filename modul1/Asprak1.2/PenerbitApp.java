public class PenerbitApp { 
 public static void main(String[] args) { 
 PenerbitBuku penerbit = new PenerbitBuku(); 
 penerbit.display(); 
 PenerbitBuku or = new PenerbitBuku("O'Reilly"); 
 or.display(); 
 PenerbitBuku gm = new PenerbitBuku("Gramedia", "Jakarta"); 
 gm.display(); 
 } 
}