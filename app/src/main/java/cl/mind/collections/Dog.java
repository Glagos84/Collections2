package cl.mind.collections;

/**
 * Created by Gabriel on 07-08-2017.
 */



public class Dog {

    private String name;
    private boolean puppy;

    public Dog(String name, boolean puppy) {
        this.name = name;
        this.puppy = puppy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPuppy() {
        return puppy;
    }

    public void setPuppy(boolean puppy) {
        this.puppy = puppy;
    }
}
