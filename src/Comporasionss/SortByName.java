package Comporasionss;

import java.util.Comparator;

public class SortByName implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int len1 = o1.name.length();
        int len2 = o2.name.length();
        int max= Math.min(len1, len2);
        for(int i=0; i<max; i++){
            char c1 = o1.name.charAt(i);
            char c2 = o2.name.charAt(i);
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
