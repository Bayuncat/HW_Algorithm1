

public class Main {
    public static void main(String[] args) {

        int [] array = {10,20,1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19};

        HeapSort.sort(array);

        for (int i =0; i<array.length; i++){
            System.out.printf("%d, ", array[i]);
        }

      }
}