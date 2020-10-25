package a.b.c.d;

public class StudentR {
    private String name;

    public StudentR() {
        System.out.println("Construct StudentR");
    }

    public StudentR(String name) {
        this.name = name;
        System.out.println("Construct StudentR name=" + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
