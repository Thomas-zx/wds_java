package a.b.c.d;

public class PersonR {
    private String name;

    public PersonR() {
        System.out.println("Construct PersonR");
    }

    public PersonR(String name) {
        this.name = name;
        System.out.println("Construct PersonR name=" + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
