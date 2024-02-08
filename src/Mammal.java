public class Mammal extends Animal {

    public void giveMilk() {
        if (this.isAlive()) {
            System.out.println("Mhhhh! I am giving milk!");
        } else {
            System.out.println("[WARN] Not giving milk: I'm dead.");
        }
    }

}
