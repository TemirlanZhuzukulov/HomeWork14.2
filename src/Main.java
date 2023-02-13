public class Main {
    public static void main(String[] args) {

        Vitamin vitamin= new Vitamin();
        Apple apple= new Apple("Red","Apple");
        System.out.println(apple);
        vitamin.vit();

        Orange orange = new Orange("orange","Orange");
        System.out.println(orange);
        vitamin.vit();

        Banana banana= new Banana("yellow","banana");
        System.out.println(banana);
        vitamin.vit();

    }
}