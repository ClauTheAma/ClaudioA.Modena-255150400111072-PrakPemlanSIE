import java.util.Arrays;

public class Search {

    public static int linearSearch(int[] arr, int search) {
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            check++;
            if (arr[i] == search) {
                System.out.println("Jumlah perbandingan linear search: " + check);
                return i;
            }
        }
        System.out.println("Jumlah perbandingan linear search: " + check);
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int check = 0;
        int low = 0, high = arr.length - 1;
        while (low < high) {
            check++;
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Jumlah perbandingan binary search: " + check);
                return mid;
            }
            if (arr[mid] < search) {
                low = mid + 1; 
            }else {
                high = mid - 1;
            }
        }
        System.out.println("Jumlah perbandingan binary search: " + check);
        return -1;
    }
    

    public static void main(String[] args) {
        int[] data = {82, 5, 66, 19, 44, 91, 13, 58, 30, 75, 2,
            49, 87, 24, 60, 33, 9, 97, 41, 88, 17, 52,
            79, 4, 38, 94, 21, 71, 10, 56};

            Arrays.sort(data); 

            int hasil = linearSearch(data, 88);
            System.out.println("Hasil linear search (88): " + hasil);

            int hasil2 = linearSearch(data, 81);
            System.out.println("Hasil linear search (81): " + hasil2);

            int hasil3 = binarySearch(data, 88);
            System.out.println("Hasil binary search (88): " + hasil3);

            int hasil4 = binarySearch(data, 81);
            System.out.println("Hasil binary search (81): " + hasil4);

    }
}
