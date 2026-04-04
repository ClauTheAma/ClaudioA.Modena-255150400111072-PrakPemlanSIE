public class Impostor implements IImpostor, ICrew { 
 private final String name;
 public Impostor(String name) { 
 this.name = name; 
 } 
 @Override 
 public void kill(ICrew crew) { 
 System.out.println(crew.getName() + " has been killed!"); 
    crew.setKilled();
 } 
 @Override 
 public void doWork() { 
 System.out.println("Impostor " + this.name + " is doing work."); 
 } 
 @Override 
 public String getName() { 
 return this.name; 
 }
@Override
    public void setKilled() {
        // Impostor biasanya tidak bisa dibunuh dengan cara kill biasa
    }
 @Override
public void Kick() {
    System.out.println(this.name + " was kicked out.");
} 
@Override
    public boolean isAlive() { 
        return true; 
    } 
}