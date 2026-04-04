public class Crew implements ICrew { 
 private String name;
 private boolean alive = true; 
 public Crew(String name) { 
 this.name = name; 
 } 
  
 @Override 
 public void doWork() { 
 System.out.println("Crew " + this.name + " is doing work."); 
 } 
 @Override 
 public String getName() { 
 return this.name; 
 } 
 @Override
    public void setKilled() {
        this.alive = false;
    }
 public void callMeeting() { 
        if (this.alive) {
            System.out.print(this.name + " found a corpse "); 
            System.out.print("and calls a meeting. "); 
            System.out.println("Let's find the impostor!"); 
        } else {
            System.out.println(this.name + " cannot call a meeting because they are dead!");
        }
    }
  @Override
public void Kick() {
    System.out.println(this.name + " was kicked out.");
} 
@Override
    public boolean isAlive() { return this.alive; }
}