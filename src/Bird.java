public class Bird extends Animal {

    public static void explain() {
        System.out.println("Ein Vogel ist ein Tier, dass Eier legt und fliegt");
    }
    public void fly() {
        if (this.isAlive()){
            System.out.println("Bird is flying.");
        }
        else {
            System.out.println("Bird is dead.");
        }
    }
}
