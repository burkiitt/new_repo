package nested_classes;

import java.awt.*;

public class Laptop {
    static int price;
    String name;
    Processor processor;

    public Laptop(String name, int price, Processor processor) {
        this.name = name;
        this.price = price;
        this.processor = processor;
    }
    public String toString() {
        return "Laptop [name=" + name + ", price=" + price +" " + processor + "]";
    }
    public void display() {
        System.out.println();
    }
    public static class Processor{
        static String name_processor;
        String generation;

        public Processor(String name_processor, String generation) {
            this.name_processor = name_processor;
            this.generation = generation;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "name_processor='" + name_processor + '\'' +
                    ", generation='" + generation + '\'' +
                    '}';
        }
        public void test(){
            System.out.println(price);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Laptop.Processor processor1 = new Laptop.Processor("Core i5","13");
        System.out.println(processor1);
        Laptop laptop = new Laptop("Asus", 4000 , processor1);
        System.out.println(laptop);
        processor1.test();
    }
}
