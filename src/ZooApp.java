public class ZooApp {
    public static void main (String[] args) {
        System.out.println("ZooApp started ...");

        Bird.explain();gi

        Bird b = new Bird();
        Bird b2 = new Bird();
        b2.setName("Max");
        b.setName("Willi");
        b.intruduce();
        b2.intruduce();




    }
}
