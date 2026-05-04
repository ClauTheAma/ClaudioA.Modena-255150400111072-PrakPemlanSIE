import java.util.Arrays;    
    public class Sort {
      public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                System.out.printf("%d:%d\n", list[k], list[i]);
                if (list[k] > list[i]) {
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }
        System.out.println("Jumlah tukar atau geser: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            /*
* Move elements of arr[0..i-1], that are greater than key,
* to one position ahead of their current position
             */
            while (k >= 0 && list[k] < key) {
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++;   
            }
            list[k + 1] = key;
        }
        System.out.println("Jumlah tukar atau geser: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;
// One by one move boundary of unsorted subarray
        for (int i = 0; i < list.length - 1; i++) {
// Find the minimum element in unsorted array
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[minIndex]) {
                    minIndex = k;
                }
            }
// Swap the found minimum element
// with the first element
            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;
        }
        System.out.println("Jumlah tukar atau geser: " + tukarAtauGeser);   
        return list;
    }

    public static void main(String[] args) {
// ubah nilai default Array ini menjadi sebanyak 30 elemen
// acak/tidak terurut dan nilai elemennya tidak ada yang ganda.
        int[] data = {10, 5, 15, 8, 3};
        int[] sorted = bubble(data);
// int[] sorted = insertion(data);
// int[] sorted = selection(data);
        int[] arr = {92, 14, 55, 3, 78, 21, 67, 40, 11, 85, 29, 6, 
                        99, 43, 72, 18, 61, 34, 50, 7, 88, 25, 63, 1, 95, 
                        37, 80, 12, 59, 47};
        int[] sortedArr = bubble(arr); 

        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(sortedArr));
    }
}