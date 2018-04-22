package java.bean;

public class Gist {
    private String id;
    private String name;

    public Gist() {
    }

    public Gist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
