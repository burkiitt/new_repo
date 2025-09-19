package nested_classes;

public class Laptop_inner {
    int price;
    private String name;
    Processor processor;
    String processor_name;
    String processor_type;

    public Laptop_inner(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public String toString() {
        return "Laptop [name=" + name + ", price=" + price +" " + processor + "]";
    }
    public class Processor{
        String name_processor;
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
            System.out.println(name);
        }
    }
}
class Test_inner{
    public static void main(String[] args) {
        Laptop_inner laptop_inner = new Laptop_inner("Asus",5000);
        Laptop_inner laptop_mac = new Laptop_inner("Macbook",4000);
        Laptop_inner.Processor pro= laptop_inner.new Processor("AMG","15");
        laptop_inner.setProcessor(pro);
        pro.test();
        laptop_mac.setProcessor(pro);
        pro.test();
        System.out.println(pro);
        System.out.println(laptop_inner);
        System.out.println(laptop_mac);
    }
}
