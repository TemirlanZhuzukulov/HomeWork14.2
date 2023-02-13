public class Apple extends  Fruit {
   private String name;



   public Apple(String colour, String name) {
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
      return "Apple{" +
              "name='" + name + '\'' +
              '}';
   }
}
