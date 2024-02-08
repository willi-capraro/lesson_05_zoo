public class Animal {

    private boolean isAlive = true;

    public boolean isAlive() {
        return isAlive;
    }

    public void kill() {
        this.isAlive = false;
    }
    private String name = "";
    public void setName(String newName) {
        this.name = newName;
    }
    public void intruduce() {
        System.out.println("hy my name is: " + this.name);
    }

}
