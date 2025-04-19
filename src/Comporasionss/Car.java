package Comporasionss;

public class Car implements Comparable<Car>{
    String name;
    int year;
    String color;
    Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString() {
        return  "name = " +name + " year = " + year + " color = " + color;
    }
    @Override
    public int compareTo(Car o) {
        int len1 = this.name.length();
        int len2 = o.name.length();
        int max= Math.min(len1, len2);
        for(int i=0; i<max; i++){
            char c1 = this.name.charAt(i);
            char c2 = o.name.charAt(i);
            if (c1>c2){
                return 1;
            }
            else if (c1<c2){
                return -1;
            }
        }
        if (len1 > len2) return 1;
        if (len1 < len2) return -1;

        return 0;
    }
}
