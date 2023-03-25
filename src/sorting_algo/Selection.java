package sorting_algo;

public class Selection {
    int[] arr = { 99, 31, 44, 23, 2, 1 };
    int size = 6;

    void sorting() {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    int temp = arr[j];
                    arr[j] = arr[min_index];
                    arr[min_index] = temp;
                }
            }
        }
    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Selection select = new Selection();
        select.sorting();
        select.print();
    }
}
