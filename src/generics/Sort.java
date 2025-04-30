package generics;

public class Sort {
    public <E extends Comparable<E>> void sort(E[] list){
        for(int i=list.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(list[j].compareTo(list[j+1])<0){
                    E temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
    public <E extends Comparable<E>> void print(E[] list){
        for(int i=list.length-1;i>=0;i--){
            System.out.print(list[i]+",");
        }
        System.out.println();
    }
}
