public class Shopipedia { 
 public static void main(String[] args) { 
 ShopiPay shopiCard = new ShopiPay(); 
 Customer miki = new Customer(shopiCard); 
 miki.deposit(10000); 
 miki.pay(2000); 
 miki.pay(3000); 
 miki.deposit(1000); 
 miki.pay(7000); 
 System.out.println("------------------"); 
 Opo opoCard = new Opo(); 
 Customer dono = new Customer(opoCard); 
 dono.deposit(10000); 
 dono.pay(2000); 
 dono.pay(3000); 
 dono.deposit(1000); 
 dono.pay(7000);
 System.out.println("------------------");


 Emoney Kris = new Emoney() {
    { this.name = "Kris";}
 @Override 
 public void topUp(double amount) { 
 System.out.println("Top up: " + amount); 
 this.balance += (amount + (0.05 * amount)); 
 this.balance(); 
 } 
 @Override 
 public void pay(double amount) { 
 double amountToPay = amount - (0.03 * amount); 
 if (this.balance > amountToPay) {  
 this.balance -= amountToPay; 
 System.out.printf("Pay " + amount); 
 System.out.println(" using " + this.name); 
 } else System.out.println("Not enough balance.");  
 this.balance();  
 } 
};

  Kris krisna = new Kris();
 Customer Clau = new Customer(krisna);
 Clau.deposit(10000);
 Clau.pay(2000);
 Clau.pay(3000);
 Clau.deposit(1000);
 Clau.pay(7000); 
}
}