public class Orange extends Fruit{
    private String name;

    public Orange(String colour, String name) {
        super(colour);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                '}';
    }
}
