public class Fruit {
      private String colour;



    public Fruit(String colour) {
        this.colour = colour;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
